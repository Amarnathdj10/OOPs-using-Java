class Animal{

    String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println(this.name + " makes sound");
    }
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override 
    public void makeSound(){
        System.out.println(this.name + " barks");
    }
}

public class PolymorphismSample2 {
    
    public static void main(String[] args) {
        
        Animal a = new Animal("Bob");
        Dog dog = new Dog("Zera");

        a.makeSound();
        dog.makeSound();
        
    }
}
