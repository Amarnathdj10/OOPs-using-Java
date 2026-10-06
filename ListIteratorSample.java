import java.util.*;

public class ListIteratorSample {
    public static void main(String[] args) {
        
        List<String> colors = new ArrayList<>(Arrays.asList("Red","Green","Blue"));
        ListIterator<String> listIt = colors.listIterator();

        System.out.println("Forward: ");
        while (listIt.hasNext()){
            System.out.println(listIt.next() + " ");
        }
        System.out.println("\nBackward: ");
        while (listIt.hasPrevious()){
            System.out.println(listIt.previous() + " ");
        }
    }
}
