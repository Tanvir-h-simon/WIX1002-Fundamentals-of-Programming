import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ID for stall 1: ");
        String ID_1 = input.nextLine();
        System.out.println("Enter how many burgers sells in stall 1: ");
        int numberOfSold_1 = input.nextInt();
        input.nextLine();

        BurgerStall stall_1 = new BurgerStall(ID_1, numberOfSold_1);

        System.out.println("Enter ID for stall 2: ");
        String ID_2 = input.nextLine();
        System.out.println("Enter how many burgers sells in stall 2: ");
        int numberOfSold_2 = input.nextInt();

        BurgerStall stall_2 = new BurgerStall(ID_2, numberOfSold_2);

        System.out.println("--- Sales Report ---");
        stall_1.displayStallSales();
        stall_2.displayStallSales();
        BurgerStall.displayTotalSales();
    }
}