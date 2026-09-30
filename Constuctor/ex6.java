public class ex6 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", 349.0);
    }
}

class Book {
    String title;
    double price;

    Book() {
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
