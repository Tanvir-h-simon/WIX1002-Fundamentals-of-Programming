public class TemporaryEmployee extends Employee {
    float workHours;

    TemporaryEmployee(String name, String type, float workHours) {
        super(name, type);
        this.workHours = workHours;
    }

    public double calculateSalary() {
        return 15 * workHours;
    }
}