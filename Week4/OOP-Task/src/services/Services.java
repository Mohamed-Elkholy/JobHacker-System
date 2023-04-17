package services;

import model.Book;
import model.Library;
import model.User;

import java.util.LinkedList;
import java.util.List;

public interface Services {
    public void addBook(Library library , Book book) ;
    public void checkoutBook(Book book) ;
    public void borrowBook(User user , Book book) ;
    public void removeBook(Library library , Book book) ;
    public void printBook(Book book) ;
    public void displayBooks(Library library) ;
    public void displayBorrowedBooks(User user);

}
