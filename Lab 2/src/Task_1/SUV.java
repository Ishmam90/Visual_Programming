package Task_1;

import java.util.List;
import java.util.List;

public class SUV extends Car{
    int passengerCapacity;
    List<String> offroadModes;
    static int count=1;

    SUV(String name, double price, int passengerCapacity, List<String> offroadModes){
        super(name, price, "SUV - " + Integer.toString(count));
        this.passengerCapacity = passengerCapacity;
        this.offroadModes = offroadModes;
        count++;
    }

    @Override
    public void startEngine(){
        System.out.println("SUV car engine starting.");
    }

    @Override
    public void stopEngine(){
        System.out.println("SUV car engine stopping.");
    }

    public void listOffroadModes(){
        for(int i=0; i<offroadModes.size(); i++){
            System.out.println(offroadModes.get(i));
        }
    }
}
