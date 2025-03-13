import java.util.Scanner;

public class main_Book {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();

        if (title.isEmpty()) {
            System.out.println("Using default book details: ");
            book.display();
        }
        else {
            System.out.println ("Enter the author of the book: ");

            String author = sc.nextLine();
            System.out.println("Enter the year the book was published: ");
            int yearPublished = sc.nextInt();

            Book specificBook = new Book(title, author, yearPublished);
            specificBook.display();
        }
        sc.close();
    }
}