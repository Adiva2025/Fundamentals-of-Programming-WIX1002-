package lab;
import java.util.*;

class BankAccount {
    private String name ;
    private String num;
    private double balance;

    public BankAccount(String name, String num, double balance) {
        this.name = name;
        this.num = num;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
        System.out.println("New balance: RM " + balance);
    }
    public void withdraw ( double amount) {
        if ( amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
            System.out.println("New balance: RM " + balance);
        } else {
            System.out.println("Insufficient funds");
        } 
    }
    public double getBalance() {
        return balance;
    }   
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("IC/Passport Number: " + num);
        System.out.println("Balance: RM " + balance);
    }
}  
public class L8Q2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter account holder name: ");
    String name = s.nextLine();
    System.out.print("Enter IC or Passport number: ");
    String num = s.nextLine();
    System.out.print("Enter initial deposit amount: RM ");
    double balance = s.nextDouble(); 

    BankAccount acc1 = new BankAccount(name, num, balance);
    acc1.deposit(109000);
    
    acc1.displayAccountInfo();

    }

    
}
