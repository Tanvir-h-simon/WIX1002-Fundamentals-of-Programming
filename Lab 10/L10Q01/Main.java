import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Salary System!");
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter employee type: ");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase("Permanent")) {
            System.out.println("Enter employee category: ");
            char category = sc.nextLine().toUpperCase().charAt(0);
            PermanentEmployee employee = new PermanentEmployee(name, type, category);
            employee.display();
        } else if (type.equalsIgnoreCase("Temporary")) {
            System.out.println("Enter employee work hours: ");
            float workHours = sc.nextFloat();
            TemporaryEmployee employee = new TemporaryEmployee(name, type, workHours);
            employee.display();
        } else if (type.equalsIgnoreCase("Contract")) {
            System.out.println("Enter employee sales: ");
            float sales = sc.nextFloat();
            ContractEmployee employee = new ContractEmployee(name, type, sales);
            employee.display();
        } else {
            System.out.println("Invalid employee type");
        }
    }
}