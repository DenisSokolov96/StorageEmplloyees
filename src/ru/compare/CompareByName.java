package ru.compare;

import ru.employee.Employee;
import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1 == employee2) return 0;
        if (employee1 == null) return -1;
        if (employee2 == null) return 1;

        return employee1.getName().compareTo(employee2.getName());
    }
}
