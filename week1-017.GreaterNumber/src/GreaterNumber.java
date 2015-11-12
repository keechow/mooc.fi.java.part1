import java.util.Scanner;
import java.lang.Math;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        }
        
        else {
            int maxNum = Math.max(num1, num2);
            System.out.println("Greater number: " + maxNum);
        }
        
        

    }
}
/*
Type the first number: 5
Type the second number: 3

Greater number: 5
The numbers are equal!
*/