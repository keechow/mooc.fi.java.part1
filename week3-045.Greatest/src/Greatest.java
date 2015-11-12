
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int largestSoFar = 0;
        if (number1 > number2) {
            largestSoFar = number1;
        }
        else {
            largestSoFar = number2;
        }
        
        if (number3 > largestSoFar) {
            largestSoFar = number3;
        }
        return largestSoFar;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}