/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birdDatabase;
    
    public Database() {
        this.birdDatabase = new ArrayList<Bird>();
    }
    
    public void addBird(String birdName, String birdLatin) {
        Bird newBird = new Bird(birdName, birdLatin);
        if (!(this.searchByName(birdName))) {
            this.birdDatabase.add(newBird);
        }
    }
    
    public void observation (String birdName) {
        boolean birdNotFound = true;
        for (Bird each: this.birdDatabase) {
            if(each.getName().equals(birdName)) {
                each.setObserve();
                birdNotFound = false;
            }
            
        }
        if (birdNotFound) {
            System.out.println("Is not a bird!");
        }
    }
    
// method: searchByName ~ true if bird is contained in birdDatabase    
    public boolean searchByName (String birdName) {
        boolean return_status = false;
        for (Bird each : this.birdDatabase) {
            if(each.getName().equals(birdName)) {
                return_status = true;
            }
        }
        return return_status;
    }
    
    public String returnOne(String birdName) {
        for (Bird each : this.birdDatabase) {
            if (each.getName().equals(birdName)) {
                return each.toString();
            }
        }
        return "Bird not found";
    }

    
    public String toString() {
        String return_string ="";
        
        for(Bird each : this.birdDatabase) {
            return_string += each.toString() + "\n";
        }
        return return_string;
    }
}
