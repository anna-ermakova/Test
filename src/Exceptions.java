import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exceptions {
    public static void main(String[] args) {


        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Что-то не так!");
            ;
        }

    }
}