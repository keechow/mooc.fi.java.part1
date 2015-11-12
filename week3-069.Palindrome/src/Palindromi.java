import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reversed_text = reverseString(text);
        int counter = 0;
        boolean return_condition = true;
        // write code here
        while(counter < text.length()) {
            if (!(text.charAt(counter) == reversed_text.charAt(counter))) {
                return_condition = false;
            }
            counter += 1;
        }
        return return_condition;
    }
    
    public static String reverseString(String text){
        int counter = text.length() - 1;
        String reversed_text = "";
        while (counter >= 0 ) {
            reversed_text += text.charAt(counter);
            counter -= 1;            
        }
        return reversed_text;
        
    }

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
}
