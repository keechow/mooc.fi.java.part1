
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
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
    
    public void advance() {
        this.day += 1;
        if (this.day > 30) {
            this.day = 1;
            this.month += 1;
        }
        
        if (this.month > 12) {
            this.month = 1;
            this.year += 1;
        }
    }
    
    public void advance(int num) {
        while (num > 0) {
            this.advance();
            num -= 1;
        }
    }
    
    public MyDate afterNumberOfDays(int days) {
        MyDate myNewDate = new MyDate(this.day, this.month, this.year);
        myNewDate.advance(days);
        return myNewDate;
    }
}