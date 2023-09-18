import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the number of elements: ");
            int numElements = scanner.nextInt();

            System.out.print("Do you want to generate values (1) or input them (2)? ");
            int choice = scanner.nextInt();

            int[] arr;

            if (choice == 1) {
                arr = BubbleSort.generateRandomArray(numElements);
            } else if (choice == 2) {
                arr = BubbleSort.getInputArray(numElements);
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                continue;
            }

            System.out.println("Original Array:");
            BubbleSort.printArray(arr);

            BubbleSort.bubbleSort(arr);

            System.out.println("Sorted Array:");
            BubbleSort.printArray(arr);

            System.out.print("Do you want to repeat (1 for yes, 0 for no)? ");
            int repeat = scanner.nextInt();

            if (repeat == 0) {
                break;
            }

        } while (true);

        scanner.close();
    }
}
