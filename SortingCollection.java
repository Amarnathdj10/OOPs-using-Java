import java.util.ArrayList;
import java.util.Collections;

public class SortingCollection {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"Banana","Apple","Mango","Grapes");
        System.out.println("List before updation: "+ list);

        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}

