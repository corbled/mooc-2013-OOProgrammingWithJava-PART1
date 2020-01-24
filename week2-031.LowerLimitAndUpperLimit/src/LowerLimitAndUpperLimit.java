
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int firstNum = reader.nextInt();

        System.out.println("Second: ");
        int lastNum = reader.nextInt();


            while (firstNum <= lastNum) {
                System.out.println(firstNum);
                firstNum ++;
            }
    }
}
