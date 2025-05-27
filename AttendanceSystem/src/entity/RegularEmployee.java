
package entity;

public class RegularEmployee extends Employee {
    private double monthlySalary;

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
