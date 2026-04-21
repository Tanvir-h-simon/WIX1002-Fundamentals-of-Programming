public class PermanentEmployee extends Employee {
    char category;

    public PermanentEmployee(String name, String type, char category) {
        super(name, type);
        this.category = category;
    }

    public double calculateSalary() {
        if (category == 'A') {
            return 4000;
        } else if (category == 'B') {
            return 3000;
        } else if (category == 'C'){
            return 2000;
        } else {
            System.out.println("Invalid category");
            return 0;
        }
    }
}