
package service;

import dao.EmployeeDAO;
import entity.Employee;
import java.util.List;

public class SalaryService {
    private EmployeeDAO dao = new EmployeeDAO();

    public void generateWeeklySalary() {
        List<Employee> employees = dao.findAll();
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            System.out.println("员工: " + e.getName() + " 本期工资: " + salary);
        }
    }
}
