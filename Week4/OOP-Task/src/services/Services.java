package services;

import model.Book;
import model.Library;
import model.User;
import validation.Validation;

import java.util.LinkedList;
import java.util.List;

public interface Services {
    public void addBook(Library library , Book book) ;
    public void addUser(Library library , User user) ;
    public void checkout(User user , Book book , Library library) ;
    public void removeBook(Library library , Book book) ;
    public void printBook(Book book , Library library) ;
    public void displayBooks(Library library) ;
    public void displayBorrowedBooks(User user , Library library);

}
