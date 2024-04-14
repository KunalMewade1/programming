package programming.programming;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the sorted array from the user
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();
        int[] sortedArray = new int[size];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < size; i++) {
            sortedArray[i] = scanner.nextInt();
        }

        // Get the target value to be searched
        System.out.print("Enter the value to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(sortedArray, target);

        // Display the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }

    // Binary search algorithm
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}
