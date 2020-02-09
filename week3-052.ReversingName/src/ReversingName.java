import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        printReverseString(name);
    }

    public static void printReverseString(String name) {
        int reverseIndex = name.length() - 1;

        while (reverseIndex >= 0) {
            System.out.print(name.charAt(reverseIndex));
            reverseIndex --;
        }

    }
}
