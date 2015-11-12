/*
EXERCISE 100.1: CLASS NIGHTSKY AND A STAR LINE
Create the class NightSky, 
that has three object variables: density (double), width (int), and height (int). 
The class should have 3 constructors:

public NightSky(double density) creates a NightSky object with the given star density. 
Width gets the value 20 and height the value 10.

public NightSky(int width, int height) creates a NightSky object with the 
given width and height. Density gets the value 0.1.

public NightSky(double density, int width, int height) 
creates a NightSky-object with the given density, width and height

Add to the class NightSky the method printLine, that prints one line of starts. 

The line length is determined by the value of the instance variable width and 
the instance variable density determines the star probability. 
For each printed character you should use a Random object to decide if it 
prints out as a white space or a star. The method nextDouble will probably be of use now.
 */
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    public NightSky(double density) {
        this(density, 20, 10);
        
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void print() {
        Random rand = new Random();
        this.starsInLastPrint = 0;
        double size = (double)this.width * this.height;
        for (int j = 0; j < this.height; j++) {
            printLine();
            }
            System.out.println("");
    }
    
    public void printLine() {
        Random rand = new Random();
        this.starsInLastPrint = 0;
        double size = (double)this.height * this.width;
        for(int i = 0; i < this.width; i++) {
            double star_prob = rand.nextDouble();
                if (star_prob < this.density){    
                    System.out.print("*");
                    this.starsInLastPrint += 1;
                }
                else {
                    System.out.print(" ");
                }
        }

    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
    
}
