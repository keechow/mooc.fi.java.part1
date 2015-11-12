
import java.util.Scanner;
import java.lang.Math;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int firstInt = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");        
        int secondInt = Integer.parseInt(reader.nextLine());
        
        int largest = Math.max(firstInt, secondInt);
        
        System.out.println("The bigger number of the two numbers given was: " + largest);
        
        /*Type a number: 20
Type another number: 14

The bigger number of the two numbers given was: 20*/

        // Implement your program here. Remember to ask the input from user
    }
}
