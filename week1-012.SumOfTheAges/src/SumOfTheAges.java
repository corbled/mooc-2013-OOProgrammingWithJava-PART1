
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String nameA = reader.nextLine();

        System.out.println("Type your age: ");
        int ageA = reader.nextInt();
        reader.nextLine();

        System.out.println("Type your name: ");
        String nameB = reader.nextLine();

        System.out.println("Type your age: ");
        int ageB = reader.nextInt();

        int combinedAge = ageA + ageB;
        System.out.println(nameA + " and " + nameB + " are " + combinedAge + " years old in total.");
        // Implement your program here
    }
}
