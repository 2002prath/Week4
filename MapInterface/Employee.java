package org.example.MapInterface;

import java.util.*;

public class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}


public class EmployeeGrouping {

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee employee : employees) {
            String department = employee.getDepartment();

            // If the department is not already in the map, add it with a new list
            departmentMap.putIfAbsent(department, new ArrayList<>());

            // Add the employee to the corresponding department's list
            departmentMap.get(department).add(employee);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        // Create sample employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "Finance"),
                new Employee("Eve", "IT")
        );

        // Group employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Display the result
        groupedEmployees.forEach((department, employeeList) ->
                System.out.println(department + ": " + employeeList)
        );
    }
}
