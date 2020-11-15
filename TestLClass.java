package CMPproject;

public class TestLClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name="Sam";
        s1.roll_no= 1;
        s1.address="kkkk";
        s1.phoneNo=523678;
        s2.name = "John";
        s2.roll_no= 2;
        s2.address="hhhhh";
        s2.phoneNo=38976;

       s1.DataOFStudent();
       s2.DataOFStudent();
    }
}
