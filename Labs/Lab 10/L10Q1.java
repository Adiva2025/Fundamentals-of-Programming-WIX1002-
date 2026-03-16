package lab;

abstract class Employee{
    protected String employeeName;
     
    public Employee(String name) {
        this.employeeName = name;
    }
    public abstract double calculateSalary();

    public void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Type: " + this.getClass().getSimpleName());
        System.out.println("Total Monthly Salary: " + calculateSalary());
        System.out.println("--------------------------");
    }

}
class permanentEmployee extends Employee{
    private char category;

    public permanentEmployee(String name, char category) {
        super(name);
        this.category = category;
    }

    @Override
    public double calculateSalary() {
        if (category == 'A') {
            return 4000;
        } else if (category == 'B') {
            return 3000;
        } else {
            return 2000;
        }
    }
}
class contractStaff extends Employee{
    private double totalSales;

    public contractStaff(String name, double totalSales) {
        super(name);
        this.totalSales = totalSales;
    }

    @Override
    public double calculateSalary() {
        return 500 * (0.5 * totalSales);
    } 
    
}
class temporaryStaff extends Employee{
    private int hoursWorked;

    public temporaryStaff(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        return 15 * hoursWorked ;
    }
}
public class L10Q1 {
    public static void main(String[] args) {

        Employee e1 = new permanentEmployee("Ali", 'A');
        Employee e2 = new contractStaff("Sara", 2000);
        Employee e3 = new temporaryStaff("John", 120);

        e1.display();
        e2.display();
        e3.display();
    }
}
