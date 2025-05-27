package ui;

import service.SalaryService;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("员工考勤系统");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 表格展示考勤记录
        String[] columnNames = {"员工编号", "日期", "出勤小时数", "是否迟到"};
        Object[][] data = {
            {1, "2023-10-01", 8.0, false},
            {1, "2023-10-02", 7.5, true}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // 操作按钮
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("添加考勤记录");
        JButton queryButton = new JButton("查询考勤记录");
        JButton statsButton = new JButton("统计考勤数据");
        buttonPanel.add(addButton);
        buttonPanel.add(queryButton);
        buttonPanel.add(statsButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}