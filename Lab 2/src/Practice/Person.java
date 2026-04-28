package Practice;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public String getName(){
        return this.name;
    }
}
