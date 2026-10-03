import java.util.ArrayList;
import java.util.Collections;

public class UpdatingElements {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Apple","Banana", "Grapes", "Mango");
        System.out.println("List before updation: "+ list);

        list.set(0,"Mango");
        System.out.println("List after updation: "+ list);

    }
}