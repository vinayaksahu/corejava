class Employee {
    String name;
    int salary;

    private Employee(String name, int salary) { // Private constructor
        this.name = name;
        this.salary = salary;
    }

    // Factory method to create Employee objects (public access)
    public static Employee createEmployee(String name, int salary) {
        return new Employee(name, salary); // Call private constructor from static method
    }
}

public class PrivateConstructor {

    public static void main(String[] args) {
        // Create an Employee object using the factory method
        Employee employee = Employee.createEmployee("Vinayak", 30);

        System.out.println(employee);
    }
}