import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.next();

        if(name.length() >= 3){
            printFirstThreeChar(name);
        }
    }

    public static void printFirstThreeChar(String name) {
        System.out.println("1. character: " + name.charAt(0));
        System.out.println("2. character: " + name.charAt(1));
        System.out.println("3. character: " + name.charAt(2));
    }
}
