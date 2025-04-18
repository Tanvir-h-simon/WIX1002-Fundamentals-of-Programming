class Number {
    int[] array;

    Number() {
        array = new int[10];
        initializeArray(100); // Default size 10, range 0-99

    }

    Number(int size) {
        array = new int[size]; // Default range 0-99
        initializeArray(100);
    }

    Number(int size, int range) {
        array = new int[size];
        initializeArray(range);
    }

    void initializeArray (int range) {
        for (int i =  0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (range));
        }
    }

    void displayArray () {
        System.out.print("Array: ");
        for (int e: array) {
            System.out.print(e + " ");
        }
    }

    void findEvenNumbers() {
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void findPrimeNumbers() {
        System.out.print("\nPrime numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void findMaximum() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("\nMaximum number: " + max);
    }

    void findMinimum() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("\nMinimum number: " + min);
    }

    void calculateAverage() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        System.out.print("\nAverage: " + average);
    }

    void findSquareNumbers() {
        System.out.print("\nPerfect square numbers: ");
        for (int i = 0; i < array.length; i++) {
            int sqrt = (int) (Math.sqrt(array[i]));
            if (sqrt * sqrt == array[i]) {
                    System.out.print(array[i] + " ");
            }
        }
    }
}