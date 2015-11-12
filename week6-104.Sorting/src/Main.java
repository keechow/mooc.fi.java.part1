import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // write testcode here
    int[] values = {6, 5, 8, 7, 11};
    System.out.println("smallest: " + smallest(values));
    
    // indexes:   0  1  2  3  4
    int[] values1 = {6, 5, 8, 7, 11};
    System.out.println("Index of the smallest: " + indexOfTheSmallest(values1));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int each : array) {
            if(each < smallest) {
                smallest = each;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallNum = array[0];
        int smallNumIdx = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i]<smallNum) {
                smallNum = array[i];
                smallNumIdx = i;
            }
        }
        return smallNumIdx;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallNumIdx = index;
        int smallNum = array[index];
        
        for(int i = index; i < array.length; i++) {
            if (array[i] < smallNum) {
                smallNum = array[i];
                smallNumIdx = i;
            }
        }
        
        return smallNumIdx;
    }
    
    public static void swap(int[] array, int idx1, int idx2) {
        int num1 = array[idx1];
        int num2 = array[idx2];
        
        array[idx1] = num2;
        array[idx2] = num1;
    }
    
    public static void sort(int[] array) {
        int smallNum = array[0];
        int smallNumIdx = 0;
               
        for(int i = 0; i < array.length; i++) {
            smallNumIdx = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallNumIdx);
        }
    }
}
