package ru.employee;

public class Employee implements Comparable<Employee>{
    private final String name;
    private final String lastName;
    private final int age;

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastName + " " + this.age;
    }

    @Override
    public int compareTo(Employee employee) {
        if (employee == null) throw new NullPointerException("Object employee is null.");

        if (this.age < employee.getAge()) return -1;
        if (this.age > employee.getAge()) return 1;

        int compare = this.lastName.compareTo(employee.getLastName());
        if (compare != 0) return compare;

        return this.name.compareTo(employee.getName());
    }
}
