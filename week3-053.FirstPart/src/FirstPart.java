
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String string_input = reader.nextLine();
        System.out.println("Length of the first part: ");
        int length_input = Integer.parseInt(reader.nextLine());
        String result = substring1(string_input, length_input);
        
        System.out.println("Result: " + result);
        
    }
    
    public static String substring1(String text, int length) {
        return (text.substring(0, length));
    }
}
