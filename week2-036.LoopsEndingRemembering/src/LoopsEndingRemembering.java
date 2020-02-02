import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        Scanner reader = new Scanner(System.in);
        int sum = 0, numsTyped = 0, even = 0, odd = 0;

        System.out.println("Type numbers: ");
        int num = Integer.parseInt(reader.nextLine());

        while (num != -1) {
            sum += num;         // Sum of numbers entered
            numsTyped ++;       // Count amount of numbers entered

            if (num % 2 == 0) { // Increment even counter
                even++;
            } else {
                odd++;          // Increment odd counter
            }

            num = Integer.parseInt(reader.next());
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);    // Print sum of numbers entered
        System.out.println("How many numbers: " + numsTyped);   // Print amount of numbers entered
        System.out.println("Average: " + (double)sum/numsTyped);    // Print average value of nums entered
        System.out.println("Even numbers: " + even + "\nOdd numbers: " + odd);  // Print number of even and odd numbers
    }
}
