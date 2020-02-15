import java.util.Scanner;

public class Palindromi {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static boolean palindrome(String text) {
        String reverse = reverse(text);

        if (text.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String text) {
        String reverse = "";
        int lastIndex = text.length() - 1;

        while (reverse.length() != text.length()) {
            reverse += text.charAt(lastIndex);
            lastIndex --;
        }

        return reverse;
    }
}
