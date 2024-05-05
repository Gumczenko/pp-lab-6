import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Kuba", 4750, 1, "01.02.2024", "Zmywak");
        Worker worker2 = new Worker("Ania", 4750, 2, "05.06.2023", "kucharz");
        Worker worker3 = new Worker("Karolina", 4750, 3, "05.04.2023", "Kucharz");
        Worker worker4 = new Worker("Marek", 4750, 4, "06.06.2023", "Klener");
        Manager manager = new Manager("Wojtek", 7500, 5, "01.02.2022", "Manager resteuracji");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.hashCode() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}