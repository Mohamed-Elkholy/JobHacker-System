package services;

import model.Book;
import model.Library;
import model.User;

public class ServicresImpl implements Services{
    public boolean isExist(Book book){
        return book.isStatus();
    }

    public boolean validID(int id){
        return id > 0 ;
    }
    @Override
    public void addBook(Library library , Book book) {
        if(validID(book.getBookID())) {
            library.getBooks().add(book);
            book.setStatus(true);
            System.out.println("The book has been added successfully ");
        } else {
            System.out.println("Error, This ID is not valid !");
        }
    }

    @Override
    public void removeBook(Library library , Book book) {
        if(isExist(book)){
            library.getBooks().remove(book);
        } else {
            System.out.println("Error, This book is not exist !");
        }
    }

    public void checkoutBook(Book book){
        if(isExist(book)){
            System.out.println("This book is exist");
        } else {
            System.out.println("This book is not exist");
        }
    }

    @Override
    public void borrowBook(User user , Book book) {
        if(isExist(book)){
            user.getBorrowedBooks().add(book);
        } else {
            System.out.println("Error, This book is not exist !");
        }
    }

    @Override
    public void printBook(Book book) {
        if(isExist(book)){
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
                printBook(library.getBooks().get(i));
            }
        } else {
            System.out.println("This library doesn't contain any books !");
        }
    }

    @Override
    public void displayBorrowedBooks(User user) {
        if(!user.getBorrowedBooks().isEmpty()) {
            for (int i = 0; i < user.getBorrowedBooks().size(); i++) {
                printBook(user.getBorrowedBooks().get(i));
            }
        } else {
            System.out.println("This user didn't borrow any book yet !");
        }
    }


}
