import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "";
        salary = 0.0;
    }

    void accept(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    Manager() {
        super(); // call to Employee's default constructor
        bonus = 0.0;
    }

    @Override
    void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    @Override
    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }

    double getTotalSalary() {
        return salary + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Managers: ");
        int n = sc.nextInt();

        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Manager " + (i + 1));
            managers[i] = new Manager();
            managers[i].accept(sc);
        }

        System.out.println("\n--- All Managers ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nManager " + (i + 1));
            managers[i].display();
        }

        // Find manager with max total salary
        double maxSalary = managers[0].getTotalSalary();
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxSalary) {
                maxSalary = managers[i].getTotalSalary();
                maxIndex = i;
            }
        }

        System.out.println("\n--- Manager with Highest Total Salary ---");
        managers[maxIndex].display();

        sc.close();
    }
}
