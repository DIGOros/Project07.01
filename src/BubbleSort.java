import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    // Method to generate an array of given length with random values
    public static int[] generateRandomArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100); // You can adjust the range as needed
        }

        return arr;
    }

    // Method to create an array of given length with values from user input
    public static int[] getInputArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    // Method to perform Bubble Sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
