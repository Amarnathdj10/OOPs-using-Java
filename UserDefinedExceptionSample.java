class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}

public class UserDefinedExceptionSample {
    static void withdraw(double balance, double amount) throws InsufficientBalanceException{
        if (amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
    }
    public static void main(String[] args) {
        try{
            withdraw(100,500);
        } catch (InsufficientBalanceException e){
            System.out.println("Error Caught: " + e.getMessage());
        }
    }
}   
