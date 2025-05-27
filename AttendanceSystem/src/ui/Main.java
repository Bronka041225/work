
package ui;

import service.SalaryService;

public class Main {
    public static void main(String[] args) {
        SalaryService service = new SalaryService();
        service.generateWeeklySalary();
    }
}
