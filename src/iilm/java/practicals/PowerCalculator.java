package iilm.java.practicals;

import java.util.Scanner;

class MyCalculator {
    // Method to calculate power
    public long power(int n, int p) throws IllegalArgumentException {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n or p should not be negative");
        }
        if (n == 0 && p == 0) {
            throw new IllegalArgumentException("n and p should not be zero");
        }
        return (long) Math.pow(n, p);
    }
}

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator calculator = new MyCalculator();

        System.out.println("Enter the base (n): ");
        int n = scanner.nextInt();
        System.out.println("Enter the power (p): ");
        int p = scanner.nextInt();

        try {
            long result = calculator.power(n, p);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
