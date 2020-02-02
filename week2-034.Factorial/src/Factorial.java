import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int tracker = 1, factorial = 1;

        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());

        while (tracker <= n) {
            factorial *= tracker;
            tracker++;
        }

            System.out.println("Factorial is " + factorial);

    }
}
