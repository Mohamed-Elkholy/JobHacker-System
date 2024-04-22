package model;

import java.util.LinkedList;
import java.util.List;

public class User {

    private int userID ;
    private String userName ;
    private List<Book> borrowedBooks = new LinkedList<>();
    public User(int userID , String userName){
        this.userID = userID ;
        this.userName = userName ;
        this.borrowedBooks = borrowedBooks ;
    }
    public void setBorrowedBooks(List<Book> borrowedBooks){
        this.borrowedBooks = borrowedBooks ;
    }
    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

}
