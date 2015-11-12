
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Up to what number? ");
        
        int userInput = Integer.parseInt(reader.nextLine());
        
        int counter = 0;
        
        while (counter < userInput) {
            counter += 1;
            System.out.println(counter);
        }
        
        // Write your code here
        
    }
}
