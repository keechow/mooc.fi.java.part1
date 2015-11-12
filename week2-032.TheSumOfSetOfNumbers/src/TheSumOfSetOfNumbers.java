
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int user_input = Integer.parseInt(reader.nextLine());
        
        int counter = 1;
        int sum = 0;
        
        while (counter <= user_input) {
            sum += counter;
            counter += 1;
        }
        System.out.println(sum);

    }
}
