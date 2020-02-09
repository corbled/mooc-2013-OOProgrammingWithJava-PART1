import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());

        endPart(word, length);
    }

    public static void endPart(String word, int num) {
        String subWord = word.substring(word.length() - (num));
        System.out.println("Result: " + subWord);
    }
}
