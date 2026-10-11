import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

class Transaction{
    private int id;
    private int value;
    private String type;

    public Transaction(int id, int value, String type){
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public int getId(){
        return id;
    }

    public int getValue(){
        return value;
    }

    public String getType(){
        return type;
    }
}

public class StreamImplementation {
    public static void main(String[] args) {
        
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1,100,"GROCERY"),
            new Transaction(3, 80, "GROCERY"),
            new Transaction(6, 120, "GROCERY"),
            new Transaction(7, 40, "ELECTRONICS"),
            new Transaction(10, 50, "GROCERY")
        );

        List<Integer> transactionIds = transactions.stream()
            .filter(t->t.getType().equals("GROCERY"))
            .sorted(Comparator.comparing(Transaction::getValue).reversed())
            .map(Transaction::getId)
            .collect(Collectors.toList());

        System.out.println(transactionIds);
    }
}
