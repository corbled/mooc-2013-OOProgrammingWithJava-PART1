
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        printChars(name);
    }

    public static void printChars(String name) {
        int num = 1;
        while (num <= name.length()) {
            System.out.println(num + ". character: " + name.charAt(num - 1));
            num ++;
        }
    }
}
