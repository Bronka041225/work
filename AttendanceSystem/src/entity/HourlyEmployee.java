
package entity;

import java.util.List;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private List<AttendanceRecord> records;

    @Override
    public double calculateSalary() {
        double totalHours = records.stream().mapToDouble(AttendanceRecord::getHours).sum();
        double normalHours = Math.min(totalHours, 40);
        double overtimeHours = Math.max(0, totalHours - 40);
        return (normalHours * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
    }
}
