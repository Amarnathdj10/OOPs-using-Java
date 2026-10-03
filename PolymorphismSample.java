//method overloading

class Calculator{

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}

public class PolymorphismSample {

    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println("Output: " + c.add(5,6));
        System.out.println("Output: " + c.add(1,2,3));
    }
}
