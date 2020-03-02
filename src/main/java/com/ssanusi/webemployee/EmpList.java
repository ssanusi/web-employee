package com.ssanusi.webemployee;

import java.util.ArrayList;

public class EmpList {
    public ArrayList<Employee> empList = new ArrayList<>();

    public EmpList() {
        empList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
        empList.add(new Employee("Sulaiman", "Sanusi", 46000, true, 2, 2));
        empList.add(new Employee("Sulaiman", "Bashir", 47000, true, 3, 3));
        empList.add(new Employee("Sulaiman", "Fatimah", 49000, true, 4, 4));
        empList.add(new Employee("Sulaiman", "Aisha", 55000, true, 5, 5));
    }

    public Employee findEmployee(CheckEmployee tester) {
        for (Employee employee : empList)
            if (tester.test(employee))
                return employee;

        return null;
    }

    public ArrayList<Employee> findEmployees(CheckEmployee tester) {
        ArrayList<Employee> employees = new ArrayList<>();

        for (Employee employee : empList)
            if (tester.test(employee))
                employees.add(employee);

        return employees;
    }
}
