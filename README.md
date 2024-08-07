# SoftwareTask1

## Integrantes:
- Juan Esteban Ocampo
- Juan pablo Corral
- Axel Ariza

## Employee java:
violates the Liskov principle in function creation
## EmployeeManager:
The single responsibility rule is violated in calculateSalary and saveToFile methods
Apply Open close to separate methods to ease the method behavior (specially in calculateSalary method)
violetes dependency inversion because classes must depend on abstractions
## EmployeeOperations:
The single responsibility rule is violated in methods
Interface Segregation Principle, it needs to turn save to file and calculate salary into a new interface
## PartTimeEmployee
Liskov principle is violated because department information is not supported on a PartTimeEmployee
## ReportGenerator
Dependency Inversion Principle is ignored, it would be more effective a general interface that provides a common actions to generating methods
## SalaryCalculator
Dependency inversion principle isnt applied, theres a direct dependency on a lower class (employeeManager) for the general class to operate


