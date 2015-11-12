
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int i = 0; i < array.length; i++) {
            int num_of_star = array[i];
            int counter = 0;
                while(counter < num_of_star) {
                    System.out.print("*");
                    counter++; 
                }
            System.out.println("");
        }
    }
}
