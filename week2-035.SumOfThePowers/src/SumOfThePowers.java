
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int track = 0, sum = 0;
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.next());

        while (track <= n) {
            int pow = (int)(Math.pow(2, track));
            sum += pow;
            track ++;
        }

        System.out.println("The result is " + sum);
    }
}
