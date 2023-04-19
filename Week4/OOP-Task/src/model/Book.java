package model;

public class Book {
    private int bookID ;
    private String title , authorName , version ;
    boolean status = false ;
    public Book(int bookID , String title , String authorName , String version , boolean status){
        this.bookID = bookID ;
        this.title = title ;
        this.authorName = authorName ;
        this.version = version ;
        this.status = status ;
    }

    public int getBookID() {
        return bookID;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getVersion() {
        return version;
    }
    public void setStatus(boolean status){
        this.status = status ;
    }

    public boolean isStatus() {
        return status;
    }
}
