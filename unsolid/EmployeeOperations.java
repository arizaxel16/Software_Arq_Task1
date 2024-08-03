package com.example.demo.unsolid;

public interface EmployeeOperations {
    void addEmployee(String name);

    void removeEmployee(String name);

    double calculateSalary(String name);

    void saveToFile(String name);
}

// Single responsability (saveToFile)
// Interface Segregation Principle, turn save to file to a new interface