class Book {
    // Attributes of the Book class
    String title;
    String author;
    int year;

    // Constructor to initialize the attributes
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + year);
    }

    public static void main(String[] args) {
        // Creating two book objects
        Book book1 = new Book("Wings of Fire", "A P J Abdul Kalam", 1999);
        Book book2 = new Book("Satyajit Ray : The Man Who Knew Too Much", "Barun Chandra", 1972);

        // Displaying details of both books
        book1.displayDetails();
        book2.displayDetails();
    }
}
