package ru;

import ru.collection.Storage;
import ru.employee.Employee;
import ru.compare.CompareByName;
import ru.search.Search;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Storage<Employee> storeEmpls = new Storage<>();
        storeEmpls.add(new Employee("Alex", "Albon", 27));
        storeEmpls.add(new Employee("Yuki", "Tsunoda", 22));
        storeEmpls.add(new Employee("Kevin", "Magnussen", 30));
        storeEmpls.add(new Employee("Nicolas", "Hulkenberg", 35));
        storeEmpls.add(new Employee("Logan", "Sargeant", 22));
        storeEmpls.add(new Employee("Nyck", "Devries", 28));
        storeEmpls.add(new Employee("Sergio", "Perez", 33));
        storeEmpls.add(new Employee("Max", "Verstappen", 25));
        storeEmpls.add(new Employee("Fernando", "Alonso", 41));
        storeEmpls.add(new Employee("Lewis", "Hamilton", 38));


        for(Employee employee: storeEmpls)
            System.out.println(employee.toString());

        Collections.sort(storeEmpls.getStorage(), new CompareByName());
        System.out.println("\n/*******   Sort by Name   **********/\n");

        for(Employee employee: storeEmpls)
            System.out.println(employee.toString());

    }


}
