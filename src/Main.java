import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome: ");
        String name = sc.nextLine();

        System.out.println("Agora informe o Departmento: ");
        String deptName = sc.nextLine();

        // 1. Criamos o funcionário
        Employee emp = new Employee(name, deptName);

        // 2. Criamos o objeto Departamento
        Department dept = new Department(deptName);

        // 3. Associamos o funcionário ao departamento (Encapsulamento em ação)
        dept.setEmployee(emp);

        // 4. Usamos o Finder para localizar e imprimir
        DepartmentFinder finder = new DepartmentFinder();
        System.out.println("\n--- Resultado da pesquisa ---");
        finder.printAssignment(dept);

        sc.close();
    }
}