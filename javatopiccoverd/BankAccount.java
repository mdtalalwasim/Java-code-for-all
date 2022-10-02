
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */
public class BankAccount {
    //This is another class of Bank Class...
    //The main Class is Bank Class...
    int bankAccountNumber;
    String accountHolderName;
    double accountBalance;
    void setAccountInfo(int number, String name, double balance){
        this.bankAccountNumber = number;
        this.accountHolderName = name;
        this.accountBalance = balance;
                
    }
    
    void displayAccountInfo(){
        System.out.println("Account Number : "+bankAccountNumber + ", Name : "
                +accountHolderName + ", Balance: " +accountBalance);
    }
    
    void deposite(double amount){
        accountBalance = accountBalance + amount;
        
        System.out.println("Deposite :"+amount);
        System.out.println("Your Current Balance :"+accountBalance);
    }
    
    void withdraw(double amount){
        if (accountBalance< amount) {
            System.out.println("Not Sufficient Balance! Please Check your Balance first.");
        }
        else{
            accountBalance = accountBalance - amount;
            System.out.println("Withdrawl Amount :"+amount);
            System.out.println("Your Current Account Balance :"+accountBalance);
        }
    }
    
    void checkBalance(){
        System.out.println("Current Balance :"+accountBalance);
    }
    
    
}
