
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String return_string = "";
        for (int i = 0; i < array.length - 1; i++) {
            String int_to_str = "" + array[i];
            return_string += (array[i] + ", ");
        }
        String final_element = "" + array[array.length - 1];
        return_string += final_element;
        System.out.println(return_string);
    }
}
