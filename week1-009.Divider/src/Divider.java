
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int first_num = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int second_num = Integer.parseInt(reader.nextLine());
        double div = (double)first_num / second_num;
        
        System.out.println("Division: " + first_num + " / " + second_num + " = " + div
        );
        // Division: 3 / 2 = 1.5
        
        

        // Implement your program here. Remember to ask the input from user.
    }
}
