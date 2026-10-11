import java.util.*;
import java.util.stream.*;

public class StreamCreation {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Java","Python","C");
        Stream<String> stream1 = list.stream();

        String[] arr = {"a","b","c"};
        Stream<String> stream2 = Arrays.stream(arr);

        Stream<Integer> stream3 = Stream.of(1,2,3,4,5);

        Stream<Integer> stream4 = Stream.iterate(1,n->n+1).limit(5);
        stream4.forEach(System.out::println);
    }    
}
