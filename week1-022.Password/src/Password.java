
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String passAttempt;

        while (true) {
            System.out.println("Type the password: ");
            passAttempt = reader.nextLine();

            if (passAttempt.equals(password)) {
                System.out.println("Right!\n\nGur frperg vf: Terng fhpprff!");  //Encrypted using rot13
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

    }
}
