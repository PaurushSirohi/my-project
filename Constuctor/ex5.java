package Constuctor;

public class ex5 {
  public static void main(String[] args){
    Book b = new Book("Java", 349);
    System.out.println(b.title);
  }
}

class Book {
  String title;
  double price;

  Book(String title, double price) {
    this.title = title;
    this.price = price;
  }
}
