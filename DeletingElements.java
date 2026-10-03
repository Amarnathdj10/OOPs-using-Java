import java.util.ArrayList;
import java.util.Collections;

public class DeletingElements {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Apple","Banana", "Grapes", "Mango");
        System.out.println("List before deletion: "+ list);
        list.remove(0);
        System.out.println("List after deletion: "+ list);
    }
}
