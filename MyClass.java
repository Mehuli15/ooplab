class MyClass {
    static int count = 0; // Static variable initialized to zero
    final double PI = 3.1415; // Constant variable initialized to 3.1415

    // Constructor increments count each time an object is created
    MyClass() {
        count++;
    }

    public static void main(String[] args) {
        // Creating multiple objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Printing the final value of count and PI
        System.out.println("Final count value: " + count);
        System.out.println("Value of PI: " + obj1.PI); // Accessing PI through any object
    }
}
