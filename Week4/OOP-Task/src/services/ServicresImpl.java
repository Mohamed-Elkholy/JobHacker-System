package services;

import model.Book;
import model.Library;
import model.User;
import validation.Validation;

public class ServicresImpl implements Services{
    public boolean isExistBook(Book book , Library library){
        return library.getBooks().contains(book) ;
    }
    public boolean isExistUser(User user , Library library){
        return library.getUsers().contains(user);
    }
    @Override
    public void addBook(Library library , Book book) {
        if(Validation.validBookID(book.getBookID() , library)) {
            library.getBooks().add(book);
            book.setStatus(true);
            System.out.println("The book has been added successfully ");
        } else {
            System.out.println("Error, This ID is not valid !");
        }
    }

    public void addUser(Library library , User user){
        if(Validation.validUserID(user.getUserID() , library)){
            library.getUsers().add(user);
            System.out.println("This user has been added successfully ");
        } else {
            System.out.println("Error, This ID is not valid !");
        }
    }
    @Override
    public void removeBook(Library library , Book book) {
        if(!library.getBooks().isEmpty() && isExistBook(book , library)){
            library.getBooks().remove(book);
        } else {
            System.out.println("Error, This book is not exist !");
        }
    }

    @Override
    public void checkout(User user , Book book , Library library) {
        if(isExistUser(user , library) && isExistBook(book , library)){
            user.getBorrowedBooks().add(book);
        } else {
            System.out.println("Error, This book is not exist or This user is not exist !");
        }
    }

    @Override
    public void printBook(Book book , Library library) {
        if(isExistBook(book , library)){
            System.out.println("Book ID : " + book.getBookID());
            System.out.println("Author name : " + book.getAuthorName());
            System.out.println("Book title : " + book.getTitle());
            System.out.println("Book version : " + book.getVersion());
            System.out.println("Book status : " + book.isStatus());
        } else {
            System.out.println("Error, This book is not exist !");
        }
    }

    @Override
    public void displayBooks(Library library) {
        if(!library.getBooks().isEmpty()){
            for(int i = 0 ; i < library.getBooks().size() ; i++){
                printBook(library.getBooks().get(i) , library);
            }
        } else {
            System.out.println("This library doesn't contain any books !");
        }
    }

    @Override
    public void displayBorrowedBooks(User user , Library library) {
        if(!user.getBorrowedBooks().isEmpty()) {
            for (int i = 0; i < user.getBorrowedBooks().size(); i++) {
                printBook(user.getBorrowedBooks().get(i) , library);
            }
        } else {
            System.out.println("This user didn't borrow any book yet !");
        }
    }


}
