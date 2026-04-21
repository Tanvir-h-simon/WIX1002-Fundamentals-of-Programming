import java.util.ArrayList;

public class Digit {
    int number;

    Digit(int number) {
        this.number = number;
    }

    // int digitMultiply(int number) {
    //     int[] numArr = new int[10]; // Static array- Fixed size
    //     int i = 0;
    //     int answer = 1;
    //     while (number > 0) {
    //         int lastDigit = number % 10;
    //         number /= 10;
    //         numArr[i] = lastDigit;
    //         i++;
    //     }
    //
    //     // for (int j = 0; j < i; j++) {
    //     //     System.out.print(numArr[j] + " ");
    //     // }
    //
    //     for (int j = 0; j < i; j++) { // i = size of the array
    //         answer *= numArr[j];
    //     }
    //     return answer;
    // }
    int digitMultiply(int number) {
        int answer = 1;
        while (number > 0) {
            int lastDigit = number % 10;
            answer *= lastDigit;
            number /= 10;
        }
        return answer;
    }

    void printAnswer(int answer) {
        System.out.println(answer);
    }
}