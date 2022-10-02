
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 * 
 * THIS IS THE MAIN CLASS - BANK CLASS
 */
public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setAccountInfo(12122, "Taimur Ahmed", 5000);
        account1.displayAccountInfo();
        
        account1.deposite(1000);
        account1.checkBalance();
        
        account1.withdraw(1000);
    }
}
