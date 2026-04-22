package Tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
    public class Library{
        String title;
        String author;
        String genre;
        static int id;

        Library(String title, String author, String genre){
            this.title=title;
            this.author=author;
            this.genre=genre;
        }

        public void add(String title, String author, String genre){
            this.title=title;
            this.author=author;
            this.genre=genre;
        }

        public boolean searchName(String sName){
            return sName.equals(title);
        }

        public boolean searchAuthor(String sName){
            return sName.equals(title);
        }

        public boolean searchGenre(String sGenre){
            return sGenre.equals(title);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Library> books;

        for(int i=0; i<3; i++){
            String title = scanner.nextLine();
            String author = scanner.nextLine();
            String genre = scanner.nextLine();

            Library books[i] = new Library(title, author, genre);
        }
    }
}
