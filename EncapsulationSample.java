class Account{

    private double balance;
    private String accountHolder;

    public Account(String accountHolder, double initialDeposit){
        this.accountHolder = accountHolder;
        this.balance = Math.max(initialDeposit,0);
    }
    
    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Denied, you cannot deposit negative money.");
            return;
        }
        this.balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + this.balance);
    }

    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Denied: Invalid withdrawal amount.");
            return;
        }

        if (amount > this.balance){
            System.out.println("Denied: Insufficient funds.");
            return;
        }

        this.balance -= amount;
        System.out.println("Withdrew "+ amount + ". New balance: " + this.balance);
    }

    public double getBalance(){
        return this.balance;
        }
    }

public class EncapsulationSample{
    public static void main(String[] args) {
        
        Account myAccount = new Account("Amarnath",50000);
        myAccount.deposit(10000);
        myAccount.withdraw(15000);
        System.out.println("Balance: " + myAccount.getBalance());
    }
}