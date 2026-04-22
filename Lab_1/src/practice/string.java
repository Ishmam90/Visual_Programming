package practice;
import java.util.Locale;

public class string {
    public static void main(String[] args){
        String firstName = "Ishmam";
        String lastName = "Kabir";
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.length());

        String name1 = new String("John");
        String name2 = new String("John");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));

        firstName = firstName.toUpperCase();
        firstName = firstName.concat(" Kabir");
    }
}
