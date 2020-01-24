
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num = 1;
        System.out.println("Up to what number? ");
        int max = reader.nextInt();

        while (num <= max) {
            System.out.println(num);
            num ++;
        }
        
    }
}
