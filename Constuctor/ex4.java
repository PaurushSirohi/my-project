package Constuctor;

public class ex4 {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.title);
    }
}

class Book {
    String title;

    Book() {
        title = "united";
    }
}

