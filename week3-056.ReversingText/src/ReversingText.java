
import java.util.Scanner;

public class ReversingText {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    public static String reverse(String text) {
        String reverse = "";
        int index = text.length() - 1;

        while (reverse.length() != text.length()) {
            reverse += text.substring(index, index + 1);
            index --;
        }

        return reverse;
    }
}
