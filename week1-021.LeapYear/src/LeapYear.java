
import java.util.Scanner;

public class LeapYear {
    /*
    if (year is not divisible by 4) then (it is a common year)
else
if (year is not divisible by 100) then (it is a leap year)
else
if (year is not divisible by 400) then (it is a common year)
else (it is a leap year)
    */

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        int yearEntered = Integer.parseInt(reader.nextLine());
        
        if (!((yearEntered % 4) == 0)) {
            System.out.println("The year is not a leap year.");    
        }
        
        else if (!((yearEntered % 100) == 0)) {
            System.out.println("The year is a leap year.");       
            }
        else if (!((yearEntered % 400) == 0)) {
            System.out.println("The year is not a leap year.");
            }
        else {
            System.out.println("The year is a leap year.");
        }
    }
}
/*
A year is a leap year if it is divisible by 4. 
But if the year is divisible by 100, 
it is a leap year only when it is also divisible by 400.

Create a program that checks whether the given year is a leap year.

Type a year: 2011
The year is not a leap year.
        
Type a year: 2012
The year is a leap year.
*/