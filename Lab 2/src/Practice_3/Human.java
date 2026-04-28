package Practice_3;

public class Human implements Swim, Flyable{
    Human(){
        System.out.println("Human Created");
    }

    public void swim(){
        System.out.println("I can swim");
    }

    public void fly(){
        System.out.println("I cannot fly");
    }
}
