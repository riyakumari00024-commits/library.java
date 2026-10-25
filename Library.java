public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void showBooks() {
        System.out.println("\n---------- BOOK LIST ----------");
        for (Book book : books) {
            System.out.println(
                "ID: " + book.getId()
                + " | Title: " + book.getTitle()
                + " | Author: " + book.getAuthor()
                + " | Available: " + book.isAvailable()
            );

                
        }
    }
    public void borrowBook(int id) {
        Book book = findBook(id);
        if(book == null) {
            System.out.println("Book not found!");
        }
        else if(book.borrowBook()) {
            System.out.println("Book borrowed successfully");
        }
        else {
            System.out.println("This book is already borrowed");
        }
    }
    
    public void returnBook(int id) {
        Book book = findBook(id);
        if(book == null) {
            System.out.println("Book not found!");
        }
        else if(book.returnBook()) {
            System.out.println("Book returned successfully");
        }
        else {
            System.out.println("This book was not borrowed");
        }

    }

    private Book findBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}