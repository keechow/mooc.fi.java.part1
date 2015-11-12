
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String first_word = reader.nextLine();
        System.out.println("Type the second word: ");
        String second_word = reader.nextLine();
        
        int result = first_word.indexOf(second_word);
        
        if (result != -1) {
            System.out.println("The word '" + second_word + "' is found in the word '" + first_word + "'.");
        } 
        else {
            System.out.println("The word '" + second_word + "' is not found in the word '" + first_word + "'.");
        }
    }
}
