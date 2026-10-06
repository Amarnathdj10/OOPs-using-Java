import java.util.*;

public class SetIterator {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        Collections.addAll(s, "A","B","C","D","E");

        for (String value: s)
            System.out.print(value + ", ");
        System.out.println();
    }
}
