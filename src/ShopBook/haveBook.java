package ShopBook;

public interface haveBook {
    public static boolean findBook(book[] listBook, book book) {
        for (book item : listBook) {
            if (item != null && item.name.equals(book.name) && item.data == book.data) {
                System.out.println("Книга уже есть в картотеке");
                return true;
            }
        }
        System.out.println("Книги нет в картотеке");
        return false;
    }

    public static void addBook(book[] listBook, book book) {
        if (!findBook(listBook, book)) {
            for (int i = 0; i < listBook.length; i++) {
                if (listBook[i] == null) {
                    listBook[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    break;
                }
                if (i == listBook.length - 1) {
                    System.out.println("Картотека переполнена");
                }
            }
        }
    }

    public static void printAllBooks(book[] listBook) {
       for (int i = 0; i < listBook.length; i++) {
           if (listBook[i] != null) {
               System.out.printf("Книга №%d: название: \"%s\", цена: %dр, год издания: %dг.", i + 1, listBook[i].name, listBook[i].price, listBook[i].data);
           }
       }
    }
}
