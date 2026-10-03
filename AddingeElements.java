import java.util.ArrayList;
import java.util.Collections;

public class AddingeElements {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        Collections.addAll(list, "Mango", "Grapes");
        System.out.println("After adding: "+ list);

    }
}
