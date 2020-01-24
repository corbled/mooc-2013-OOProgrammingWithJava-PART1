
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int input = reader.nextInt();
        int sum = 0, count = 1;

        while (count <= input) {
            sum += count;
            count++;
        }

        System.out.println("Sum is " + sum);
    }
}
