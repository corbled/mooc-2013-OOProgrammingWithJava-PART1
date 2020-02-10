
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        fillArrayList(reader, words);
        Collections.sort(words);
        printArrayList(reader, words);
    }

    public static void fillArrayList(Scanner reader, ArrayList<String> words) {
        String word = "";

        while (true) {
            System.out.println("Type a word: ");
            word = reader.nextLine();

            if (!word.isEmpty()) {
                words.add(word);
            } else {
                break;
            }
        }
    }

    public static void printArrayList(Scanner reader, ArrayList<String> words) {
        System.out.println("You typed the following words: ");

        for(String word : words) {
            System.out.println(word);
        }
    }
}
