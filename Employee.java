package CMPproject;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private float salary;
    Employee(int id, String firstName, String lastName, float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public String getName(){
        return firstName + lastName;
    }
    public float getAnnualSalary(){
        return salary*12;
    }
    public double raiseSalary(){
        double newSalary = salary + salary*0.1;
        return newSalary;

    }

    @Override
    public String toString() {
        return "Employee[ ID: "+id+ "Name: "+firstName+lastName+"Salary: "+ salary;
    }
}
