
package entity;

public abstract class Employee {
    protected int id;
    protected String name;
    protected int projectId;

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
