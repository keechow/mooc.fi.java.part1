
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        
        int counter = 3;
        
        while (counter > 0) {
            System.out.println("Please enter an integer: ");
            read = Integer.parseInt(reader.nextLine());
            sum += read;
            counter -= 1;
        }
        
        
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
