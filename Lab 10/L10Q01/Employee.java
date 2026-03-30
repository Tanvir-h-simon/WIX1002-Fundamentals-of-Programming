abstract class Employee {
    String name;
    String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Type: " + type);
        System.out.println("Employee Salary: " + calculateSalary() + " RM");
    }
}