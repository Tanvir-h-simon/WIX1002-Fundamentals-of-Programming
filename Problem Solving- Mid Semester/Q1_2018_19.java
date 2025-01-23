import java.util.Scanner;

public class Q1_2018_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of staff [N]: ");
        int N = scan.nextInt();
        
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            System.out.print("Staff ID: ");
            int id = scan.nextInt();
            
            int digit2 = (id / 10) % 10; // Second digit from the left
            int digit4 = (id / 1000) % 10; // Second digit from the left
            
            if (digit2 % 2 != 0 && digit4 % 2 == 0) {
                System.out.println("Weekend Off");
            } else {
                System.out.println("Weekend Duty");
                count++;
            }
        }
        System.out.println("The number of staffs work during weekend is " + count);
    }
}