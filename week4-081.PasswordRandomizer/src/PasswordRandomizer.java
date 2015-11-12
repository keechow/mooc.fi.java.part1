import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String passwordString = "abcdefghijklmnopqrstuvwxyz";
        int passNum = 26;
        int counter = 0;
        String returnString = "";
        
        while(counter < this.length) {
            char passChar = passwordString.charAt(random.nextInt(passNum));
            returnString += passChar;
            counter += 1;
        }
        
        return returnString;
    }
}
