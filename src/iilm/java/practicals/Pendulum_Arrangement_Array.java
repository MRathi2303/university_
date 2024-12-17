package iilm.java.practicals;


import java.util.*;

public class Pendulum_Arrangement_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("The number of elements must be positive.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Create the pendulum arrangement
        int[] pendulum = new int[n];
        int mid = (n - 1) / 2, left = mid - 1, right = mid + 1;
        pendulum[mid] = arr[0];

        for (int i = 1, toggle = 0; i < n; i++, toggle ^= 1) {
            if (toggle == 0) {
                pendulum[right++] = arr[i];
            } else {
                pendulum[left--] = arr[i];
            }
        }

        // Output the pendulum arrangement
        System.out.println("Pendulum arrangement: " + Arrays.toString(pendulum));

        // Close the scanner
        scanner.close();
    }
}