interface Add{
    int addition(int a, int b);
}

public class LambdaExpressionSample {
    public static void main(String[] args) {
        
        Add add = (a,b) -> a+b;
        int result = add.addition(5,3 );
        System.out.println("Sum: "+ result);
    }
}
