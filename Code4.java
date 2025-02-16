package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


    class Employee implements Serializable {
        private static final long serialVersionUID = 1L;

        private int id;
        private String name;
        private String department;
        private double salary;

        // Constructor
        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }


        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public class Code4 {
        private static final String FILE_NAME = "employees.dat";

        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            // Adding employees to the list
            employees.add(new Employee(1, "Alice", "HR", 50000));
            employees.add(new Employee(2, "Bob", "IT", 70000));
            employees.add(new Employee(3, "Charlie", "Finance", 60000));

            // Serialize the employees to the file
            serializeEmployees(employees);

            // Deserialize and display employees
            List<Employee> retrievedEmployees = deserializeEmployees();
            if (retrievedEmployees != null) {
                System.out.println("Retrieved Employees:");
                for (Employee employee : retrievedEmployees) {
                    System.out.println(employee);
                }
            }
        }

        // Method to serialize employees to a file
        private static void serializeEmployees(List<Employee> employees) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(employees);
                System.out.println("Employees have been serialized to " + FILE_NAME);
            } catch (IOException e) {
                System.err.println("Error serializing employees: " + e.getMessage());
            }
        }

        // Method to deserialize employees from a file
        @SuppressWarnings("unchecked")
        private static List<Employee> deserializeEmployees() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                return (List<Employee>) ois.readObject();
            } catch (IOException e) {
                System.err.println("Error deserializing employees: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.err.println("Employee class not found: " + e.getMessage());
            }
            return null;
        }
    }


