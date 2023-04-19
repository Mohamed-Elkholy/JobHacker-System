package validation;

import model.Library;

public class Validation {
    static public boolean validBookID(int id , Library library){
        if(id <= 0) {
            //System.out.println("This book is not exist");
            return false ;
        }
        for(int i = 0 ; i < library.getBooks().size() ; i++){
            if(library.getBooks().get(i).getBookID() == id) {
                //System.out.println("This book is not exist");
                return false ;
            }
        }
        return true ;
    }
    static public boolean validUserID(int id , Library library){
        if(id <= 0) {
            //System.out.println("This user is not exist");
            return false ;
        }
        for(int i = 0 ; i < library.getUsers().size() ; i++){
            if(library.getUsers().get(i).getUserID() == id) {
                //System.out.println("This user is not exist");
                return false ;
            }
        }
        return true ;
    }

}
