package CMPproject;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31)
            this.day = day;

        else
            System.out.println("invalid input");
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else
            System.out.println("invalid input");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 2033 && year >= 1800)
            this.year = year;
    }

    @Override
    public String toString() {
        return "{Date: " + day + "/" + month + "/" + year+"}";
    }

    public String Display() {
        if (day > 9 && month > 9)
            return "Date: " + day + "/" + month + "/" + year;
        else{
            if (day <= 9 && month > 9)
            return "Date: " + "0" + day + "/" + month + "/" + year;
            else
                return "Date: " + "0" + day + "/" +"0"+ month + "/" + year;

    }
    }
}




