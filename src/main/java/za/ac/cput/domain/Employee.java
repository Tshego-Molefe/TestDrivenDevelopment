package za.ac.cput.domain;

/**
 * Tshegofatso Molefe
 * 219001235
 * 10 March 2023
 */
public class Employee {
    private int empNumber;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(){

    }

    public Employee(int empNumber, String firstName, String lastName, double salary) {
        this.empNumber = empNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
