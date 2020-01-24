
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        double a = Double.parseDouble(reader.nextLine());

        System.out.println("Type another number: ");
        double b = Double.parseDouble(reader.nextLine());

        double bigger = Math.max(a,b);

        System.out.println("The bigger number of the two numbers given was: " + bigger);
        // Implement your program here. Remember to ask the input from user
    }
}
