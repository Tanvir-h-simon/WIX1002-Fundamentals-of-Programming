import java.util.Scanner;

public class V01Q02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int startingValue = input.nextInt();
        System.out.print("Enter the ending value: ");
        int endingValue = input.nextInt();

        for (int i = startingValue; i <= endingValue; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Lululala");
            }
            else if (i % 3 == 0) {
                System.out.println("Lulu");
            }
            else if (i % 5 == 0) {
                System.out.println("Lala");
            }
            else {
                System.out.println(i);
            }
        }
        // for (int i = startingValue; i <= endingValue; i++) {
        //     int condition = (i % 3 == 0 ? 1 : 0) + (i % 5 == 0 ? 2 : 0);
        //
        //     switch (condition) {
        //         case 1:
        //             System.out.println("Lulu");
        //             break;
        //         case 2:
        //             System.out.println("Lala");
        //             break;
        //         case 3:
        //             System.out.println("LuluLala");
        //             break;
        //         default:
        //             System.out.println(i);
        //             break;
        //     }
        // }

        input.close();
    }
}