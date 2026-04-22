package practice;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Taking input " + name);

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Taking input " + age);

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        scanner.close();
    }
}
