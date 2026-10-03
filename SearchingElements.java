import java.util.ArrayList;
import java.util.Collections;

public class SearchingElements {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Apple","Banana", "Grapes", "Mango");

        if (list.contains("Mango")){
            System.out.println("Mango is present in the list");
        }
    }
}