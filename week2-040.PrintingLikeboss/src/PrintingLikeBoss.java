public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print("*");
            counter += 1;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int counter = 0;
        while (counter < amount) {
            System.out.print(" ");
            counter += 1;
        }        
        // 40.1
    }

    public static void printTriangle(int size) {
        int counter = 1;
        
        while(counter <= size) {
            int count = size - counter;
            printWhitespaces(count);
            printStars(counter);            
            counter += 1;
            
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        // 40.3
        int counter = 1;
        int standCounter = height - 2;
        int standWidth = 3;
        
        while (counter <= height) {
            int whiteSpaceCounter = height - counter;
            int starCounter = 2*counter - 1;
            
            printWhitespaces(whiteSpaceCounter);
            printStars(starCounter);
            
            counter += 1;                       
        }
        printWhitespaces(standCounter);
        printStars(standWidth);
        printWhitespaces(standCounter);
        printStars(standWidth);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        //printTriangle(5);
        //System.out.println("---");
        xmasTree(4);
        //System.out.println("---");
       // xmasTree(10);
    }
}
