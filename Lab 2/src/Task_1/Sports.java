package Task_1;

public class Sports extends Car{
    int topSpeed;
    static int count=1;

    Sports(String name, double price, int topSpeed){
        super(name, price, "Sports - " + Integer.toString(count));
        this.topSpeed = topSpeed;
        count++;
    }

    @Override
    public void startEngine(){
        System.out.println("Sports car engine starting.");
    }

    @Override
    public void stopEngine(){
        System.out.println("Sports car engine stopping.");
    }

    public void boost(){
        System.out.println("Activating boost! Top Speed : " + this.topSpeed + " km/h");
    }
}
