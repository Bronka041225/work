package dao;

import entity.AttendanceRecord;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private List<AttendanceRecord> records = new ArrayList<>();

    public void addRecord(AttendanceRecord record) {
        records.add(record);
    }

    public List<AttendanceRecord> findRecordsByEmployeeId(int employeeId) {
        return records.stream()
                      .filter(record -> record.getEmployeeId() == employeeId)
                      .toList();
    }

    public void updateRecord(AttendanceRecord record) {
        records.removeIf(r -> r.getEmployeeId() == record.getEmployeeId() && r.getDate().equals(record.getDate()));
        records.add(record);
    }

    public void deleteRecord(AttendanceRecord record) {
        records.removeIf(r -> r.getEmployeeId() == record.getEmployeeId() && r.getDate().equals(record.getDate()));
    }
}