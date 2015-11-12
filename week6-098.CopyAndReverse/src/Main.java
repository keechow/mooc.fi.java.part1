import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));

    }
    
    public static int[] copy(int[] array) {
        int array_length = array.length;
        int[] copied = new int[array_length];
        
        System.arraycopy(array, 0, copied, 0, array.length);
        
        return copied;
    }
    
    public static int[] reverseCopy(int[] array) {
        int length = array.length;
        int[] reverse = new int[length];
        int counter = 0;
        
        for (int i = length-1; i>=0; i--) {
            reverse[counter] = array[i];
            counter ++;
            }
            
        return reverse;
    }
    
}
