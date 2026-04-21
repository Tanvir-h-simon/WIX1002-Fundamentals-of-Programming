import java.util.Arrays;
import java.util.Scanner;

public class V02Q02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Array 1: ");
        String input1 = scan.nextLine();
        int[] array1 = parseArray(input1);

        System.out.print("Array 2: ");
        String input2 = scan.nextLine();
        int[] array2 = parseArray(input2);

        // System.out.println("Arrays: " + Arrays.toString(array1) + ", " + Arrays.toString(array2));

        int[] mergedArray = mergeArray(array1, array2);

        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] parseArray(String input){
        String[] parts = input.split(",");
        int[] array = new int[parts.length];

        for (int i = 0; i < parts.length; i++){
            array[i] = Integer.parseInt(parts[i].trim());
        }
        return array;
    }

    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] tempMergeArray = new int[array1.length + array2.length];

        // arraycopy(sourceArray, sourcePosition, destinationArray, destinationPosition, length)
        System.arraycopy(array1, 0, tempMergeArray, 0, array1.length);
        System.arraycopy(array2, 0, tempMergeArray, array1.length, array2.length);

        Arrays.sort(tempMergeArray); // Ascending order

        int[] uniqueArray = new int[tempMergeArray.length];
        int count = 0;

        for (int i = 0; i < tempMergeArray.length; i++) {
            if (i == 0 || tempMergeArray[i] != tempMergeArray[i - 1]) { // Remove duplicates
                uniqueArray[count++] = tempMergeArray[i];
            }
        }
        // copyOf(originalArray, newLength)
        return Arrays.copyOf(uniqueArray, count);
    }
}