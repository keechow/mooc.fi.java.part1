
import java.util.Scanner;
import java.lang.Math; 

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Circumference of the circle: " + circumference);        
        
        //Circumference of the circle: 125.66370614359172
        // Program your solution here 
    }
}
