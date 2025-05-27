
package entity;

import java.util.List;

public class SalesEmployee extends Employee {
    private List<Order> orders;

    @Override
    public double calculateSalary() {
        return orders.stream()
                     .mapToDouble(order -> order.getAmount() * order.getCommissionRate())
                     .sum();
    }
}
