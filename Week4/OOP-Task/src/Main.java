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
        Services services = new ServicresImpl() ;
        Book[] books = new Book[3];
        books[0] = new Book(5 , "math" , "DR.Hagag" , "1" , true);
        books[1] = new Book(6 , "science" , "DR.Taha" , "8" , true);
        books[2] = new Book(7 , "Chemistry" , "DR.Sayed" , "5" , true);

        User[] users = new User[5];
        users[0] = new User(1 , "Mohamed");
        users[1] = new User(-2 , "Ahmed");
        users[2] = new User(1 , "Ali");
        users[3] = new User(4 , "Amr");
        users[4] = new User(5 , "Saied");

        for(int i = 0 ; i < 3 ; i++){
            services.addBook(library , books[i]);
        }
        for(int i = 0 ; i < 5 ; i++){
            services.addUser(library , users[i]);
        }

        services.checkout(users[0] , books[2] , library);
        services.checkout(users[1] , books[0] , library);
        services.checkout(users[1] , books[1] , library);

        services.displayBooks(library);
        System.out.println("_______________________________________________________________________________________________");
        services.displayBorrowedBooks(users[0] , library);
        System.out.println("_______________________________________________________________________________________________");
        services.displayBorrowedBooks(users[1] , library);
        System.out.println("_______________________________________________________________________________________________");
        services.displayBorrowedBooks(users[2] , library);

    }
}