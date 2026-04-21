public class V01Q06 {
    public static void main(String[] args) {

        // 1st row
        for (int i = 0; i < 77; i++) {
            if ((i == 0 || i == 6 || i == 20 || i == 40 || i == 46) ||
                    (i >= 10 && i <= 16) || (i >= 30 && i <= 36) ||
                    (i >= 50 && i <= 56) || (i >= 60 && i <= 66) || (i >= 70 && i <= 76))
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();

        // 2nd row
        for (int i = 0; i < 77; i++) {
            if (i == 0 || i == 1 || i == 5 || i == 6 || i == 10 || i == 16 || i == 20 || i == 30 || i == 36 ||
                    i == 41 || i == 45 || i == 50 || i == 63 || i == 70 || i == 76) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        // 3rd row
        for (int i = 0; i < 77; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 10 || i == 16 || i == 20 || i == 30 || i == 36 ||
                    i == 42 || i == 44 || i == 50 || i == 63 || i == 70 || i == 76)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();

        // 4th row
        for (int i = 0; i < 77; i++) {
            if (i == 0 || i == 3 || i == 6 ||
                    (i >= 10 && i <= 16) || i == 20 || (i >= 30 && i <= 36) ||
                    i == 43 || (i >= 50 && i <= 56) || i == 63 || (i >= 70 && i <= 76))
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();

        // 5th row
        for (int i = 0; i < 77; i++) {
            if (i == 0 || i == 6 || i == 10 || i == 16 || i == 20 || i == 30 || i == 36 ||
                    i == 43 || i == 56 || i == 63 || i == 70 || i == 76)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();

        // 6th row
        for (int i = 0; i < 77; i++) {
            if (i == 0 || i == 6 || i == 10 || i == 16 || i == 20 || i == 30 || i == 36 || i == 43 ||
                    i == 56 || i == 63 || i == 70 || i == 76)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();

        // 7th row
        for (int i = 0; i < 77; i++) {
            if (i == 0 || i == 6 || i == 10 || i == 16 || (i >= 20 && i <= 26) || i == 30 || i == 36 || i == 43 ||
                    (i >= 50 && i <= 56) || (i >= 60 && i <= 67) || i == 70 || i == 76)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
