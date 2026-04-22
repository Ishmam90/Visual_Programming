package Tasks;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count =0;

        System.out.println("What is 2+2?");
        int answer = scanner.nextInt();
        scanner.nextLine();
        if(answer==4)   count++;

        System.out.println("What is 2*2?");
        answer = scanner.nextInt();
        scanner.nextLine();
        if(answer==4)   count++;

        System.out.println("What is 2/2?");
        answer = scanner.nextInt();
        scanner.nextLine();
        if(answer==1)   count++;

        System.out.println("What is 2%2?");
        answer = scanner.nextInt();
        scanner.nextLine();
        if(answer==0)   count++;

        System.out.println("What is 2^2?");
        answer = scanner.nextInt();
        scanner.nextLine();
        if(answer==4)   count++;

        System.out.println(count);
        scanner.close();
    }
}
