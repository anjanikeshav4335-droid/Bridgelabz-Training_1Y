class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        System.out.println("Manager: " + name + ", Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        System.out.println("Developer: " + name + ", Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int durationMonths;

    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    void displayDetails() {
        System.out.println("Intern: " + name + ", Duration: " + durationMonths + " months");
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Manager("Ravi", 101, 50000, 5);
        Employee e2 = new Developer("Anjani", 102, 40000, "Java");
        Employee e3 = new Intern("Amit", 103, 10000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}