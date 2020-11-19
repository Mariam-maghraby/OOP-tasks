package CMPproject;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(1,1,2000);
        d1.setDay(-12);
        d1.setMonth(14);
        d1.setYear(1999);
        System.out.println(d1.getDay());
        System.out.println(d1.Display());


    }
}
