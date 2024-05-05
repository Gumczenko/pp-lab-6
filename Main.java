import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Kuba", 4750, 1, "01.02.2024", "Zmywak");
        Worker worker2 = new Worker("Ania", 4750, 2, "05.06.2023", "kucharz");
        Worker worker3 = new Worker("Karolina", 4750, 2, "05.04.2023", "Kucharz");
        Manager manager = new Manager("Wojtek", 7500, 5, "01.02.2022", "Manager resteuracji");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker2.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker2.getName() + " equals worker3: " + worker3.equals(worker2));
        System.out.println(worker2.getName() + " equals manager: " + worker3.equals(manager));
        }
    }
