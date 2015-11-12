
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int string_length = text.length();
        int counter = string_length - 1;
        String return_string = "";
        while (counter >= 0) {
            char current_char = text.charAt(counter);
            return_string += current_char;
            counter -= 1;            
        }     
        
        return return_string;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
