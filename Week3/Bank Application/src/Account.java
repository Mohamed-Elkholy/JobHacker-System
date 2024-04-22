public class Account {

    private int accountNumber ;
    String holderName ;
    double balance ;

    public Account(){

    }
    public Account(int accountNumber , String holderName , double balance){
        this.accountNumber = accountNumber ;
        this.holderName = holderName ;
        this.balance = balance ;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String getHolderName(){
        return this.holderName;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposite(double amount){}

    public void withdraw(double amount){}



}
