// copy constructor

public class Car{

    public String Engine;

    public Car(){

    }

    public Car(Car previousCar){
        this.Engine = previousCar.Engine;
    }
}

public void main(String[]args){

    Car myFirstCar = new Car();
    myFirstCar.Engine = "V8 turbo";

    Car secondCar = new Car(myFirstCar);
    System.out.println("Second car engine: " + secondCar.Engine);

}
