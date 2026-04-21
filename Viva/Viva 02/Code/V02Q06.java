import java.util.Scanner;

public class V02Q06 {

    public static int[][] parseMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of the square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter row number %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(((matrix[i][j] < 10) ? " " + matrix[i][j] : matrix[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = parseMatrix();

        System.out.println("\nThe original matrix:");
        displayMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("The matrix after rotating:");
        displayMatrix(matrix);
    }
}