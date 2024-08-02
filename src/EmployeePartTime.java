public class EmployeePartTime implements Employee{
    @Override
    public String getName() {
        return "John Doe - Part Time";
    }

    @Override
    public float getSalary() {
        return 10000;
    }
}
