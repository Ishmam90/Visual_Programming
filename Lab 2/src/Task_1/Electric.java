package Task_1;

public class Electric extends Car{
    Float batteryLevel;
    static int count=1;

    Electric(String name, double price, float batteryLevel){
        super(name, price, "Electric - " + Integer.toString(count));
        this.batteryLevel = batteryLevel;
        count++;
    }

    @Override
    public void startEngine(){
        System.out.println("Electric car engine starting.");
    }


    public void stopEngine(){
        System.out.println("Electric car engine stopping.");
    }

    public void chargeBattery(){
        System.out.println("Charging battery to 100%");
    }
}
