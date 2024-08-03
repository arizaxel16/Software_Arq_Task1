package com.example.demo.unsolid;

public class  EmployeeManager implements EmployeeOperations {

    public void addEmployee(String name) {
        // Agregar empleado
    }

    public void removeEmployee(String name) {
        // Eliminar empleado
    }

    public double calculateSalary(String name) {
        // Calcular salario
        return 0.0;
    }

    public void saveToFile(String name) {
        // Guardar en archivo
    }
}
// Single responsability (calculate salary and save to file must be in a different class)
// Open close (It should have a class that receives and object to do the methods)
// Create new method by polymorph to prevent problems with calculateSalary
// Classes must depend on abstractions
