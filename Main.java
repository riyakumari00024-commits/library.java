import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = {
            new Book(1, "Java Basics","Herbet Schildt"),
            new Book(2,"Object Oriented Programming","E. Balagurusmay"),
            new Book(3,"Data Structures","Seymour Lipschutz"),
            new Book(4,"Computer Networks","Andrew Tanenbaum"),
            new Book(5,"Database Fundamentals","Ramez Elmasri")
        };
        Library library = new Library(books);
        int choice;
        do {
            System.out.println("\n======== LIBRARY MANAGEMENT SYSTEM ========");
            System.out.println("1. Show all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.println("Enter book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    library.borrowBook(borrowId);
                    break;
                case 3:
                    System.out.println("Enter book ID to return:");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 4:
                    System.out.println("Thank you for using the library!");
                    break;
                default:
                    System.out.println("Inavlid choice! Try again:");


            }
            
        } while (choice!=4);
        
        sc.close();
    }
    
}
