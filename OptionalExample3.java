package String;

import java.util.List;
import java.util.Optional;

class Manager {
    String name;
    String department; // can be null

    Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }

    public String toString() {
        String dept = Optional.ofNullable(department)
                .orElse("Department Unknown");
        return name + " (" + dept + ")";
    }
}

class Employee {
    String name;
    Optional<Manager> manager; // may or may not have a manager

    Employee(String name, Optional<Manager> manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() { return name; }
    public Optional<Manager> getManager() { return manager; }

    public String toString() {
        String mgrString = manager
                .map(mgr -> mgr.toString())
                .orElse("No Manager Assigned");

        return name + " -> " + mgrString;
    }
}

public class OptionalExample3 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", Optional.of(new Manager("Bob", "IT"))),
            new Employee("Charlie", Optional.of(new Manager("David", null))),
            new Employee("Eve", Optional.empty())
        );

        employees.forEach(System.out::println);
    }
}
