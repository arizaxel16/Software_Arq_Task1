public class SalaryCalc {
    private Employee employee;

    public SalaryCalc(Employee employee){
        this.employee = employee;
    }

    public float getSalary(){
        return employee.getSalary();
    }
}
