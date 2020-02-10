

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        fillArray(reader, words);
        Collections.reverse(words);
        printArray(reader, words);
    }

    public static void fillArray(Scanner reader, ArrayList<String> words) {
        String word = "";

        while(true) {
            System.out.println("Type a word: ");
            word = reader.nextLine();

            if (!word.isEmpty()) {
                words.add(word);
            } else {
                break;
            }
        }
    }

    public static void printArray(Scanner reader, ArrayList<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
