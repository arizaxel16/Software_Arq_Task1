public class EmployeeManager implements Employee, EmployeeOperations {
    @Override
    public String getName() {
        return "John Doe - Manager";
    }

    @Override
    public float getSalary() {
        return 0;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void removeEmployee(Employee employee) {

    }
}
