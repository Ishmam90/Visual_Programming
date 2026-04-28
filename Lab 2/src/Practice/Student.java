package Practice;

public class Student extends Person {
    int roll;
    String dept;
    static int count = 0;

    Student(String name, int age, int roll, String dept){
        super(name, age);
        this.roll = roll;
        this.dept = dept;
        count++;
    }

    public void display(){
        super.display();
        System.out.println(roll);
        System.out.println(dept);
        System.out.println(count);
    }

    @Override
    public String getName(){
        String s;
        s = "Student name : " + super.getName();
        return s;
    }
}
