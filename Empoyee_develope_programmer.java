package ass2;
import java.util.Scanner;



abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    abstract double calculateBonus();
    abstract String generatePerformanceReport();
    abstract void manageProject(String projectName);

    public void displayInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String address, double salary, int teamSize) {
        super(name, address, salary, "Manager");
        this.teamSize = teamSize;
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // 20% bonus for managers
    }

    @Override
    String generatePerformanceReport() {
        return "Manager " + name + " is managing " + teamSize + " team members effectively.";
    }

    @Override
    void manageProject(String projectName) {
        System.out.println("Manager " + name + " is overseeing project: " + projectName);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // 15% bonus for developers
    }

    @Override
    String generatePerformanceReport() {
        return "Developer " + name + " is proficient in " + programmingLanguage;
    }

    @Override
    void manageProject(String projectName) {
        System.out.println("Developer " + name + " is working on project: " + projectName);
    }
}

class Programmer extends Employee {
    private String specialization;

    public Programmer(String name, String address, double salary, String specialization) {
        super(name, address, salary, "Programmer");
        this.specialization = specialization;
    }

    @Override
    double calculateBonus() {
        return salary * 0.10; // 10% bonus for programmers
    }

    @Override
    String generatePerformanceReport() {
        return "Programmer " + name + " specializes in " + specialization;
    }

    @Override
    void manageProject(String projectName) {
        System.out.println("Programmer " + name + " is coding for project: " + projectName);
    }
}

public class a2b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        // Accept Manager details
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String mName = sc.nextLine();
        System.out.print("Address: ");
        String mAddr = sc.nextLine();
        System.out.print("Salary: ");
        double mSal = sc.nextDouble();
        System.out.print("Team Size: ");
        int teamSize = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        employees[0] = new Manager(mName, mAddr, mSal, teamSize);

        // Accept Developer details
        System.out.println("\nEnter Developer Details:");
        System.out.print("Name: ");
        String dName = sc.nextLine();
        System.out.print("Address: ");
        String dAddr = sc.nextLine();
        System.out.print("Salary: ");
        double dSal = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        System.out.print("Programming Language: ");
        String lang = sc.nextLine();
        employees[1] = new Developer(dName, dAddr, dSal, lang);

        // Accept Programmer details
        System.out.println("\nEnter Programmer Details:");
        System.out.print("Name: ");
        String pName = sc.nextLine();
        System.out.print("Address: ");
        String pAddr = sc.nextLine();
        System.out.print("Salary: ");
        double pSal = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        System.out.print("Specialization: ");
        String spec = sc.nextLine();
        employees[2] = new Programmer(pName, pAddr, pSal, spec);

        // Display information and generate reports for each employee
        System.out.println("\n-------- Employee Reports --------");
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Bonus: $" + emp.calculateBonus());
            System.out.println("Performance Report: " + emp.generatePerformanceReport());
            emp.manageProject("Project Alpha");
            System.out.println("----------------------------------------");
        }
        
        sc.close();
    }
}