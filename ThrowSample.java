class ThrowSample{
    static void checkage(int age){
        
        if (age < 18){
            throw new IllegalArgumentException("Age must be above 18");
        }
    }

    public static void main(String[] args) {
        checkage(15);
    }

}