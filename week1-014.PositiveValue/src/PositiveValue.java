
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        float num = Integer.parseInt(reader.nextLine());
        
        if (num > 0){
            System.out.println("The number is positive."); 
        }
        
        else{
            System.out.println("The number is not positive.");
        }

        // Type your program here:
    }
}

/* Type a number: 5

The number is positive.
        */
