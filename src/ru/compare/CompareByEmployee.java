package ru.compare;

import ru.employee.Employee;

import java.util.Comparator;

public class CompareByEmployee implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        if (employee1 == employee2) return 0;
        if (employee1 == null) return -1;
        if (employee2 == null) return 1;

        int compare = employee1.getName().compareTo(employee2.getName());
        if (compare != 0) return compare;

        compare = employee1.getLastName().compareTo(employee2.getLastName());
        if (compare != 0) return compare;

        return employee1.getAge() - employee2.getAge();
    }

}
