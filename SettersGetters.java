class Employee {
    private String name;
    private int salary;

    // Separate setter methods for name and salary
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Separate getter methods for name and salary
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class SettersGetters {

    public static void main(String[] args) {
        // Create an Employee object using the constructor
        Employee employee = new Employee();

        //setters
        employee.setName("Vinayak");
        employee.setSalary(30);

        // Access and print the employee's name
        String name = employee.getName();
        int salary = employee.getSalary();
        System.out.println("Name: " + name);
        System.out.println("Name: " + salary);
    }
}