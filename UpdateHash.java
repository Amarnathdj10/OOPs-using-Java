import java.util.*;

public class UpdateHash{
    public static void main(String[] args) {
        
        Map<Integer,String> hm1 = new HashMap<>();

        hm1.put(1,"Geeks");
        hm1.put(2,"Geeks");
        hm1.put(3,"Geeks");

        System.out.println("Hash map before updating: "+ hm1);

        hm1.put(2,"For");
        System.out.println("Hash map after updating: "+ hm1);

    }
}