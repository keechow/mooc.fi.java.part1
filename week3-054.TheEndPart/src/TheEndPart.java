import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String string_input = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length_input = Integer.parseInt(reader.nextLine());
        
        String return_string = endpart(string_input, length_input);
        System.out.println("Result: " + return_string);
        
        
        
    }
    
    public static String endpart(String text, int length) {
        int string_length = text.length();
        int length_wanted = string_length - length;
        return (text.substring(length_wanted));
    }
}
