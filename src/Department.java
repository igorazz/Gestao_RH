public class Department {
    private String name;

    private Employee employee;

    public Department(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }
}