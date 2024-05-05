import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Kuba", 4750, 1);
        Worker worker2 = new Worker("Ania", 4750, 2);
        Worker worker3 = new Worker("Karolina", 4750, 3);
        Worker worker4 = new Worker("Marek", 4750, 4);
        Manager manager = new Manager("Wojtek", 7500, 5);

        System.out.println("Salary of worker 1: " + worker1.getSalary());
        worker1.work();
        System.out.println("Salary of worker 2: " + worker2.getSalary());
        worker2.work();
        System.out.println("Salary of worker 3: " + worker3.getSalary());
        worker3.work();
        System.out.println("Salary of worker 4: " + worker4.getSalary());
        worker4.work();
        System.out.println("Salary of manager: " + manager.getSalary());
        manager.work();
    }
}