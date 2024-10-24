package ShopBook;

public class ShopBook implements haveBook {
    public static void main(String[] args) {
        book[] listBook = new book[99];

        book book1 = new book();
        book1.name = "The Hobbit";
        book1.price = 999;
        book1.data = 1937;

        haveBook.addBook(listBook, book1);

        book book2 = new book();
        book2.name = "The Hobbit1";
        book2.price = 999;
        book2.data = 1937;

        haveBook.addBook(listBook, book2);
        haveBook.printAllBooks(listBook);
    }
}
