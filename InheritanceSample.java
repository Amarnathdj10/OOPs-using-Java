class Animal{

    String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println(this.name + " makes an unknown noise");
    }

    public void sit(){
        System.out.println(this.name + " sits down");
    }

}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println(this.name + " barks");
    }
    
}

public class InheritanceSample {

    public static void main(String[] args) {
        
        Animal cat = new Animal("Bob");
        Dog dog = new Dog("Zera");

        cat.makeSound();
        dog.sit();
        cat.sit();
        dog.sit();
        dog.bark();
    }
    
}
