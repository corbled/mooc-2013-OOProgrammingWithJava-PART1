
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double a = Double.parseDouble(reader.nextLine());

        System.out.println("Type another number: ");
        double b = Double.parseDouble(reader.nextLine());

        double divider = a/b;
        System.out.println("Division: " + a + " / " + b + " = " + divider);
        // Implement your program here. Remember to ask the input from user.
    }
}
