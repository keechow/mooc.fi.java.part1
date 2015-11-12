import java.util.ArrayList;
import java.lang.Math;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int each : list) {
            sum += each;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double list_size = (double) list.size();
        return (sum(list) / list_size);
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        double total = 0.0;
        int list_size = list.size();
        
        for(int each : list) {
            total = total + Math.pow((each - average), 2);
        }
        
        double return_value = total / (list_size - 1);
        return return_value;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
