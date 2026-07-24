import numpy as np
import pandas as pd

# -----------------------------
# Gaussian Naive Bayes Class
# -----------------------------
class GaussianNaiveBayes:

    def fit(self, X, y):
        self.classes = np.unique(y)
        self.mean = {}
        self.var = {}
        self.prior = {}

        for c in self.classes:
            X_c = X[y == c]
            self.mean[c] = np.mean(X_c, axis=0)
            self.var[c] = np.var(X_c, axis=0)
            self.prior[c] = len(X_c) / len(X)

    def gaussian_probability(self, class_label, x):
        mean = self.mean[class_label]
        var = self.var[class_label]

        # Avoid division by zero
        var = np.where(var == 0, 1e-9, var)

        numerator = np.exp(-((x - mean) ** 2) / (2 * var))
        denominator = np.sqrt(2 * np.pi * var)

        return numerator / denominator

    def predict(self, X):
        predictions = []

        for x in X:
            posteriors = []

            for c in self.classes:
                prior = np.log(self.prior[c])
                likelihood = np.sum(np.log(self.gaussian_probability(c, x)))
                posterior = prior + likelihood
                posteriors.append(posterior)

            predictions.append(self.classes[np.argmax(posteriors)])

        return np.array(predictions)


# -----------------------------
# Load Dataset
# -----------------------------
df = pd.read_csv("example.csv")

# Convert categorical columns into numeric values
for col in df.columns:
    if df[col].dtype == object:
        df[col] = pd.factorize(df[col])[0]

# Separate features and target
X = df.iloc[:, :-1].values
y = df.iloc[:, -1].values

# -----------------------------
# Train the Model
# -----------------------------
model = GaussianNaiveBayes()
model.fit(X, y)

# -----------------------------
# Make Predictions
# -----------------------------
predictions = model.predict(X)

# -----------------------------
# Calculate Accuracy
# -----------------------------
accuracy = np.mean(predictions == y)

# -----------------------------
# Display Results
# -----------------------------
print("Predicted Class Labels:")
print(predictions)

print("\nActual Class Labels:")
print(y)

print("\nAccuracy: {:.2f}%".format(accuracy * 100))