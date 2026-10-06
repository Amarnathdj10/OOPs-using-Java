import java.util.Iterator;
import java.util.ArrayList;

public class OddElementRemoval {
    public static void main(String[] args) {
        
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i=0; i < 10; i++){
            a1.add(i);
        }
        System.out.println("Original list: "+ a1);
        
        Iterator<Integer> itr = a1.iterator();
        while (itr.hasNext()){
            int i = itr.next();
            System.out.print(i + " ");
            if (i%2 == 0){
                itr.remove();
            }
        }
        System.out.println();
        System.out.print("New list: " + a1);
    }
}
