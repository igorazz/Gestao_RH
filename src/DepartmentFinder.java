public class DepartmentFinder {

    public void printAssignment(Department dept) {
        if (dept.getEmployee() != null) {
            System.out.println("No departamento " + dept.getName() + " trabalha o colaborador: " + dept.getEmployee().getName());
        } else {
            System.out.println("O departamento " + dept.getName() + " está vazio.");
        }
    }
}