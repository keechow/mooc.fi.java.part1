
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        int yearDiff = this.year - comparedDate.year;
        int monthDiff = 0;
        int dayDiff = 0;
        if (yearDiff > 0 ){ 
            monthDiff = this.month - comparedDate.month;
            dayDiff = this.day - comparedDate.day;
        }
        else { 
            monthDiff = comparedDate.month - this.month;
            dayDiff = comparedDate.day - this.day;
        }
        
        if (monthDiff > 0) {
            return Math.abs(yearDiff);
        }
        
        else if (monthDiff <0) {
            return (Math.abs(yearDiff) - 1);
        }
        
        else {
            if (dayDiff >= 0) {
                return Math.abs(yearDiff);
            }
            
            else {
                return (Math.abs(yearDiff) - 1);
            }
        }
        
        
    }
    
    public int getBirthYear() {
        return this.year;
    }
    
    public int getBirthMonth() {
        return this.month;
    }
    
    public int getBirthDay() {
        return this.day;
    }
            
            
            
}


  
