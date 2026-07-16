import pandas as pd
import numpy as np
import time
from collections import Counter
from sklearn.model_selection import train_test_split
from sklearn.metrics import (
    accuracy_score,
    precision_score,
    recall_score,
    f1_score
)

# =====================================================
# TREE NODE
# =====================================================

class Node:
    def __init__(self,
                 feature=None,
                 value=None,
                 children=None,
                 prediction=None):

        self.feature = feature
        self.value = value
        self.children = children if children else {}
        self.prediction = prediction


# =====================================================
# DECISION TREE
# =====================================================

class DecisionTree:

    def __init__(self,
                 criterion='information_gain',
                 max_depth=10):

        self.criterion = criterion
        self.max_depth = max_depth
        self.root = None

    # -------------------------------------------------
    # Entropy
    # -------------------------------------------------

    def entropy(self, y):

        classes, counts = np.unique(y, return_counts=True)

        probs = counts / counts.sum()

        return -np.sum(probs * np.log2(probs + 1e-10))

    # -------------------------------------------------
    # Gini
    # -------------------------------------------------

    def gini(self, y):

        classes, counts = np.unique(y, return_counts=True)

        probs = counts / counts.sum()

        return 1 - np.sum(probs ** 2)

    # -------------------------------------------------
    # Information Gain
    # -------------------------------------------------

    def information_gain(self, X_column, y):

        parent_entropy = self.entropy(y)

        values = np.unique(X_column)

        weighted_entropy = 0

        for value in values:

            subset = y[X_column == value]

            weighted_entropy += (
                len(subset) / len(y)
            ) * self.entropy(subset)

        return parent_entropy - weighted_entropy

    # -------------------------------------------------
    # Gain Ratio
    # -------------------------------------------------

    def gain_ratio(self, X_column, y):

        ig = self.information_gain(X_column, y)

        values, counts = np.unique(
            X_column,
            return_counts=True
        )

        probs = counts / counts.sum()

        split_info = -np.sum(
            probs * np.log2(probs + 1e-10)
        )

        if split_info == 0:
            return 0

        return ig / split_info

    # -------------------------------------------------
    # Gini Gain
    # -------------------------------------------------

    def gini_gain(self, X_column, y):

        parent_gini = self.gini(y)

        values = np.unique(X_column)

        weighted_gini = 0

        for value in values:

            subset = y[X_column == value]

            weighted_gini += (
                len(subset) / len(y)
            ) * self.gini(subset)

        return parent_gini - weighted_gini

    # -------------------------------------------------
    # Best Feature Selection
    # -------------------------------------------------

    def best_feature(self, X, y):

        best_score = -1
        best_feature = None

        for feature in X.columns:

            if self.criterion == 'information_gain':
                score = self.information_gain(
                    X[feature],
                    y
                )

            elif self.criterion == 'gain_ratio':
                score = self.gain_ratio(
                    X[feature],
                    y
                )

            elif self.criterion == 'gini':
                score = self.gini_gain(
                    X[feature],
                    y
                )

            if score > best_score:
                best_score = score
                best_feature = feature

        return best_feature

    # -------------------------------------------------
    # Majority Class
    # -------------------------------------------------

    def majority_class(self, y):

        return Counter(y).most_common(1)[0][0]

    # -------------------------------------------------
    # Build Tree
    # -------------------------------------------------

    def build_tree(self, X, y, depth=0):

        # Pure node
        if len(np.unique(y)) == 1:
            return Node(
                prediction=y[0]
            )

        # Max depth
        if depth >= self.max_depth:
            return Node(
                prediction=self.majority_class(y)
            )

        # No features left
        if len(X.columns) == 0:
            return Node(
                prediction=self.majority_class(y)
            )

        best = self.best_feature(X, y)

        node = Node(feature=best)

        for value in np.unique(X[best]):

            mask = X[best] == value

            X_subset = X[mask].drop(
                columns=[best]
            )

            y_subset = y[mask]

            child = self.build_tree(
                X_subset,
                y_subset,
                depth + 1
            )

            node.children[value] = child

        return node

    # -------------------------------------------------
    # Fit
    # -------------------------------------------------

    def fit(self, X, y):

        self.root = self.build_tree(X, y)

    # -------------------------------------------------
    # Predict Single Sample
    # -------------------------------------------------

    def predict_sample(self, sample, node):

        if node.prediction is not None:
            return node.prediction

        feature_value = sample[node.feature]

        if feature_value not in node.children:
            return 0

        return self.predict_sample(
            sample,
            node.children[feature_value]
        )

    # -------------------------------------------------
    # Predict Dataset
    # -------------------------------------------------

    def predict(self, X):

        predictions = []

        for _, row in X.iterrows():

            predictions.append(
                self.predict_sample(
                    row,
                    self.root
                )
            )

        return np.array(predictions)

    # -------------------------------------------------
    # Tree Depth
    # -------------------------------------------------

    def tree_depth(self, node=None):

        if node is None:
            node = self.root

        if node.prediction is not None:
            return 1

        return 1 + max(
            self.tree_depth(child)
            for child in node.children.values()
        )

    # -------------------------------------------------
    # Leaf Count
    # -------------------------------------------------

    def count_leaves(self, node=None):

        if node is None:
            node = self.root

        if node.prediction is not None:
            return 1

        return sum(
            self.count_leaves(child)
            for child in node.children.values()
        )


# =====================================================
# SAMPLE DATASET
# =====================================================

data = {
    'Outlook': [
        'Sunny','Sunny','Overcast','Rain',
        'Rain','Rain','Overcast','Sunny',
        'Sunny','Rain','Sunny','Overcast',
        'Overcast','Rain'
    ],

    'Temperature': [
        'Hot','Hot','Hot','Mild',
        'Cool','Cool','Cool','Mild',
        'Cool','Mild','Mild','Mild',
        'Hot','Mild'
    ],

    'Humidity': [
        'High','High','High','High',
        'Normal','Normal','Normal',
        'High','Normal','Normal',
        'Normal','High','Normal',
        'High'
    ],

    'Wind': [
        'Weak','Strong','Weak','Weak',
        'Weak','Strong','Strong',
        'Weak','Weak','Weak',
        'Strong','Strong',
        'Weak','Strong'
    ],

    'Play': [
        0,0,1,1,1,0,1,
        0,1,1,1,1,1,0
    ]
}

df = pd.DataFrame(data)

X = df.drop('Play', axis=1)
y = df['Play']

# =====================================================
# TRAIN TEST SPLIT
# =====================================================

X_train, X_test, y_train, y_test = train_test_split(
    X,
    y,
    test_size=0.3,
    random_state=42
)

# =====================================================
# FUNCTION TO RUN MODEL
# =====================================================

def evaluate_model(criterion_name):

    tree = DecisionTree(
        criterion=criterion_name,
        max_depth=10
    )

    start = time.time()

    tree.fit(X_train, y_train.values)

    end = time.time()

    predictions = tree.predict(X_test)

    accuracy = accuracy_score(
        y_test,
        predictions
    )

    precision = precision_score(
        y_test,
        predictions,
        zero_division=0
    )

    recall = recall_score(
        y_test,
        predictions,
        zero_division=0
    )

    f1 = f1_score(
        y_test,
        predictions,
        zero_division=0
    )

    depth = tree.tree_depth()

    leaves = tree.count_leaves()

    print("\n" + "="*50)
    print("Criterion :", criterion_name)
    print("="*50)

    print("Accuracy       :", round(accuracy,4))
    print("Precision      :", round(precision,4))
    print("Recall         :", round(recall,4))
    print("F1 Score       :", round(f1,4))
    print("Tree Depth     :", depth)
    print("Leaf Nodes     :", leaves)
    print("Training Time  :", round(end-start,6),"sec")


# =====================================================
# RUN ALL ALGORITHMS
# =====================================================

evaluate_model('information_gain')   # ID3

evaluate_model('gain_ratio')         # C4.5

evaluate_model('gini')               # CART