import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Kuba", 4750, 1, "01.02.2024", "Zmywak");
        Worker worker2 = new Worker("Ania", 4750, 2, "05.06.2023", "kucharz");
        Worker worker3 = new Worker("Karolina", 4750, 3, "05.04.2023", "Kucharz");
        Worker worker4 = new Worker("Kasia", 4750, 4, "05.04.2023", "Kucharz");
        Worker worker5 = new Worker("Asia", 4750, 4, "05.04.2023", "Kucharz");
        Manager manager1 = new Manager("Wojtek", 7500, 5, "01.02.2022", "Manager resteuracji");
        Manager manager2 = new Manager("Marek", 7500, 6, "01.02.2022", "Manager resteuracji");
        Manager manager3 = new Manager("Krzysztof", 7500, 7, "01.02.2022", "Manager resteuracji");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
        }

        System.out.println("Total salary of workers: " + totalWorkerSalary);
        System.out.println("Total salary of managers: " + totalManagerSalary);
        System.out.println("Total salary of all employees: " + totalSalary);
    }
}