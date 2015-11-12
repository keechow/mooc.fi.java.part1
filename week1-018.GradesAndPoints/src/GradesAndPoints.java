
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String grade;
        System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        
        if (points <= 60 && points >= 50) {
            grade = "5";
        }
        else if (points <= 49 && points >= 45) {
            grade = "4";
        }
        else if (points <= 44 && points >= 40) {
            grade = "3";
        }
        else if (points <= 39 && points >= 35) {
            grade = "2";
        }
        else if (points <= 34 && points >= 30) {
            grade = "1";
        }
        else {
            grade = "failed";
                    
        }
        
        System.out.println("Grade: " + grade);
    }
}
