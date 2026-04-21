public class ContractEmployee extends Employee {
    double sales;

    ContractEmployee(String name, String type, float sales) {
        super(name, type);
        this.sales = sales;
    }

    public double calculateSalary() {
        return 500 + (sales * 0.5);
    }
}