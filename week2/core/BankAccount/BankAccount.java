import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private String accountNumber="" ;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    public BankAccount(){
        accounts++;
        //Ninja Bonus 3: In the constructor, call the private method from above
        // so that each user has a random ten-digit account.
        getAccountNumber();
    }
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance,double savingsBalance){
        this.checkingBalance=checkingBalance;
        this.savingsBalance=savingsBalance;
        accounts++;

    }

    // GETTERS and SETTERS
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public void setCheckingBalance(double  checkingBalance ){
         this.checkingBalance=checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
    public void setSavingsBalance(double  savingsBalance ){
         this.savingsBalance=savingsBalance;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public static int getAccounts() {
        return accounts;
    }
    // for checking, savings, accounts, and totalMoney
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public double deposit(double amount,String accountType){
        double newTotalAmount=0.0;
        if(accountType==("ckecking")){
          
            newTotalAmount=(this.checkingBalance+=amount);
            totalMoney+=amount; 
        }else if(accountType==("saving")){
            newTotalAmount=(this.savingsBalance+=amount); 
            totalMoney+=amount;
        }else{
            System.out.println("please specify the nature of the transaction");
        }
         return newTotalAmount; 
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public double withdraw(double amount,String accountType){
    
        double newTotalAmount=0.0;
        if(accountType==("ckecking")){
            if(this.checkingBalance>=amount){      
            newTotalAmount=(this.checkingBalance-=amount);
            totalMoney-=amount;
            }else {
                System.out.println("there are insufficient funds");
            }
          
        }else if(accountType==("saving")){
            if(this.savingsBalance>=amount){ 
            newTotalAmount=(this.savingsBalance-=amount); 
            totalMoney-=amount;
            }else{
                System.out.println("there are insufficient funds");
            }
        }else{
            System.out.println("please specify the nature of the transaction");
        }
         return newTotalAmount;    
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.println("You Checking Balance is :" +this. getCheckingBalance());
        System.out.println("You Saving balance is :" +this.getSavingsBalance());
    }
    //Ninja Bonus 2: Create a private method that returns a random ten digit account number. 
     
    private String getAccountNumber(){
        Random randomno = new Random();
     for(int i=0; i<10; i++){
        accountNumber+=randomno.nextInt(9)+1;
     }
     //System.out.println("the bank account number is"+accountNumber);
     return accountNumber;
    }
}
