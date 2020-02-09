import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        fillList(reader, words);
        printList(words);
    }

    public static void fillList(Scanner reader, ArrayList<String> words) {
        while (true) {
            System.out.println("Type a word: ");

            String word = reader.nextLine();
            if (!word.isEmpty()) {
                words.add(word);
            } else {
                break;
            }
        }
    }

    public static void printList(ArrayList<String> words) {
        System.out.println("You typed the following words:");
        for(String word : words) {
            System.out.println(word);
        }
    }
}
