package com.juaracoding;

import java.util.*;

class Employee {
    int employeeId;
    String employeeName;
    double salary;

    // Constructor
    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + salary;
    }
}

public class CollectionJava {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(1));
        cars.set(0,"Toyota");
        System.out.println(cars);

        cars.remove(2);
        System.out.println(cars);

        int size = cars.size();
        System.out.println(size);

//        cars.clear();
//        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toUpperCase());
        }

        for(String car : cars){
            System.out.println(car.toUpperCase());
        }

        // prices "100","200","300" = 600
        // "Berapa data yang akan di input = "

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Volvo");
        linkedList.add("BMW");
        linkedList.add("Ford");
        linkedList.add("Mazda");
        System.out.println(linkedList);
        linkedList.addFirst("Toyota");
        System.out.println(linkedList);

        HashSet data = new HashSet();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(2);
        System.out.println(data);

        // Employee
        // Create a HashMap with employeeId as key and Employee as value
        Map<Integer, Employee> employeeMap = new HashMap<>();

        // Add employee data to the HashMap
        employeeMap.put(101, new Employee(101, "John Doe", 50000));
        employeeMap.put(102, new Employee(102, "Alice Smith", 60000));
        employeeMap.put(103, new Employee(103, "Bob Johnson", 55000));
        employeeMap.put(104, new Employee(104, "Charlie Brown", 70000));

        // Print original HashMap
        System.out.println("Original Employee Data:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // Searching for an employee by name
        String searchName = "Alice Smith";  // You can change this name for other searches
        Employee foundEmployee = searchByEmployeeName(employeeMap, searchName);
        if (foundEmployee != null) {
            System.out.println("\nFound Employee: " + foundEmployee);
        } else {
            System.out.println("\nEmployee with name " + searchName + " not found.");
        }

        // Sorting by employeeName
        System.out.println("\nSorted by employeeName:");

        // Create a list from the elements of the HashMap
        List<Map.Entry<Integer, Employee>> listEmployee = new ArrayList<>(employeeMap.entrySet());

        // Sort the list based on employeeName
        listEmployee.sort((entry1, entry2) -> entry1.getValue().getEmployeeName().compareTo(entry2.getValue().getEmployeeName()));

        // Print sorted list
        for (Map.Entry<Integer, Employee> entry : listEmployee) {
            System.out.println(entry.getValue());
        }
    }

    // Method to search employee by name
    public static Employee searchByEmployeeName(Map<Integer, Employee> employeeMap, String name) {
        // Iterate over the map and check if employeeName matches
        for (Employee employee : employeeMap.values()) {
            if (employee.getEmployeeName().equalsIgnoreCase(name)) {
                return employee; // Return the employee if found
            }
        }
        return null; // Return null if no employee found with the given name

    }

}
