package model;

import java.util.LinkedList;
import java.util.List;

public class Library {

    static private String libraryName = "Benha library", libraryCode = "S76N10";
    private List<Book> books = new LinkedList<>();
    private List<User> users = new LinkedList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setBooks(List<Book> books){
        this.books = books ;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getLibraryCode() {
        return libraryCode;
    }

    public List<Book> getBooks() {
        return books;
    }

}
