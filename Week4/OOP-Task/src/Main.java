import jdk.internal.dynalink.support.LinkerServicesImpl;
import model.Book;
import model.Library;
import model.User;
import services.Services;
import services.ServicresImpl;

import java.util.* ;
public class Main {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Enter the library name ");
        library.setLibraryName(s.next());
        System.out.println("Enter the library code ");
        library.setLibraryName(s.next());
        ServicresImpl servicres = new ServicresImpl() ;
        Book[] book = new Book[3];
        for(int i = 0 ; i < 3 ; i++){
            book[i] = new Book();
            System.out.println("Enter the book ID ");
            book[i].setBookID(s.nextInt());
            System.out.println("Enter the book title ");
            book[i].setTitle(s.next());
            System.out.println("Enter the author name ");
            book[i].setAuthorName(s.next());
            System.out.println("Enter the book version ");
            book[i].setVersion(s.next());
            servicres.addBook(library , book[i]);
        }

        User[] user = new User[5];
        for(int i = 0 ; i < 5 ; i++){
            user[i] = new User();
        }
        servicres.borrowBook(user[1] , book[0]);
        servicres.borrowBook(user[1] , book[2]);

        servicres.displayBooks(library);
        System.out.println("_________________________________________________________");
        servicres.displayBorrowedBooks(user[1]);
        System.out.println("_________________________________________________________");
        servicres.displayBorrowedBooks(user[2]);

    }
}