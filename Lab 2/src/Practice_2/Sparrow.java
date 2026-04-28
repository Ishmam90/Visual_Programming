package Practice_2;

public class Sparrow extends Bird {
    String name;

    Sparrow(double weight, boolean fly, String name){
        super(weight, fly);
        this.name = name;
    }

    @Override
    public void eating() {
        System.out.println(this.name + " is eating");
    }
}
