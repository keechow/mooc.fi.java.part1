
import java.util.Scanner;
import java.lang.Math;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        
        double user_input = Double.parseDouble(reader.nextLine());
        
        int counter = 0;
        int sum = 0;
        
        while (counter <= user_input) {
            double sum1 = Math.pow(2, counter);
            sum += (int)sum1;
            counter += 1;
        }
        System.out.println(sum);
        
        

    }
}
