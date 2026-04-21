import java.util.Scanner;

public class V02Q05 {
    public static void printFruit(String[] fruits){
        int num = 1;
        for(String n : fruits){
            System.out.println(num + ". " + n);
            num++;
        }
    }

    public static int getIdxFruit(String[] fruits, String selectedFruit){
        String select = selectedFruit.replace(" ","");
        int i;
        for(i = 0; i < 7; i++){
            if (fruits[i].equalsIgnoreCase(select)){
                return i;
            }
        }
        return -1;
    }

    public static boolean haveProduct(String[] fruits, int fruitIdx){
        return fruitIdx >= 0 && fruitIdx < fruits.length;
    }

    public static boolean haveStock(int fruitIdx, int[] storage, int quantity){
        return storage[fruitIdx] >= quantity;
    }

    public static void generateBill(String[] fruits, int fruitIdx, double[]price, int
            quantity){
        double tot=quantity*price[fruitIdx];
        System.out.println("------------------------------------------------------------");
        System.out.println("---------------------Fresh Mart Receipt---------------------");
        System.out.println("-".repeat(60));
        System.out.println("Product             Quantity            Price per Unit(RM)  ");
        System.out.println(fruits[fruitIdx] + "                  " + quantity + "                       " + price[fruitIdx]);
        System.out.println("-".repeat(60));
        System.out.printf("Total Price: RM %.2f\n", tot);
        System.out.println("-".repeat(60));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] fruits = {"Apple", "Grape", "Banana", "Mango", "Orange",
                "Strawberry", "Blueberry"};
        int[] storage = {45, 57, 75, 34, 75, 65, 78};
        double[] price = {5.00, 10.00, 2.50, 6.00, 3.00, 15.00, 12.00};

        printFruit(fruits);

        System.out.print("Please enter the fruit you want to buy: ");
        String fruitSelect = in.nextLine();

        System.out.print("Unit or Box: ");
        int quantity = in.nextInt();

        int fruitIdx = getIdxFruit(fruits, fruitSelect);

        if (!haveProduct(fruits, fruitIdx)) {
            System.out.println("Sorry we currently do not offer this product.");
        } else if (!haveStock(fruitIdx, storage, quantity)) {
            System.out.println("Sorry, we do not have enough stock for " + fruits[fruitIdx]
                    + ". Please come again later!");
        } else {
            System.out.println("\nKindly Checkout here: ");
            generateBill(fruits, fruitIdx, price, quantity);
        }
    }
}