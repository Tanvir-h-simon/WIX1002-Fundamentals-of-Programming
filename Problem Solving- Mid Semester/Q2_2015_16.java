import java.util.Scanner;

public class Q2_2015_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double totalPrice = 0.0;
                
        while (true){
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            String durianType = input.next().toUpperCase();
            
            if (durianType.equals("QUIT")){
                break;
            }
            
            System.out.print("Enter the sales in kg: ");
            double salesKg = input.nextDouble();
            
            double pricePerKg = 0;
            
            switch (durianType){
                case "MK":
                    pricePerKg = 25;
                    break;
                case "HL":
                    pricePerKg = 22;
                    break;
                case "D24":
                    pricePerKg = 20;
                    break;
                case "UM":
                    pricePerKg = 18;
                    break;
                default:
                    System.out.println("Invalid durian type. Please try again.");
            }
            totalPrice += pricePerKg * salesKg;
        }  
        System.out.println("Total Sales: " + totalPrice);
    } 
}