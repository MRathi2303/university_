package sem_3rd.practicals;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int value = 1;
        int layer = 0;

        while (layer < (n + 1) / 2) {
            int end = n - layer - 1;

            // Fill the top row
            for (int i = layer; i <= end; i++) {
                matrix[layer][i] = value;
                value++;
            }

            // Fill the right column
            for (int i = layer + 1; i <= end; i++) {
                matrix[i][end] = value;
                value++;
            }

            // Fill the bottom row
            for (int i = end - 1; i >= layer; i--) {
                matrix[end][i] = value;
                value++;
            }

            // Fill the left column
            for (int i = end - 1; i > layer; i--) {
                matrix[i][layer] = value;
                value++;
            }

            layer++;
        }

        // Print the matrix
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}