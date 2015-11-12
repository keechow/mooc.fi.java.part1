public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
        
    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
    }
    
    public String toString() {
        // returns the string representation
        String hours_string = "" + hours.getValue();
        String minutes_string = "" + minutes.getValue();
        String seconds_string = "" + seconds.getValue();
        
        if (seconds.getValue() <= 9) {
            seconds_string = "0" + seconds.getValue();
        }
        
        if (minutes.getValue() <= 9) {
            minutes_string = "0" + minutes.getValue();
        }
        
        if (hours.getValue() <= 9) {
            hours_string = "0" + hours.getValue();
        }
        
        String return_string = hours_string + ":" + minutes_string + ":" + seconds_string;
        return return_string;
    }
}
