package Task_1;

abstract public class Car {
    String name;
    double price;
    String model;

    Car(String name, double price, String model){
        this.name = name;
        this.price = price;
        this.model = model;
    }

    abstract public void startEngine();
    abstract public void stopEngine();
}
