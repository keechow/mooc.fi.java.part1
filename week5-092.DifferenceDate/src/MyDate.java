import java.lang.Math;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
        
}
    


 