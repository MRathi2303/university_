package iilm.java.practicals;


import java.util.Scanner;

public class Bank_ATM_Denomination_Display {
    public static void main(String[] args) {
        String[] words = {
                "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE",
                "SIX", "SEVEN", "EIGHT", "NINE"
        };

        Scanner scanner = new Scanner(System.in);

        // Accepting the amount from the user
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        // Check for invalid amount (negative or more than 5 digits)
        if (amount <= 0 || amount > 99999) {
            System.out.println("INVALID AMOUNT");
            return;
        }

        // Convert the amount to words
        System.out.print("Amount in words: ");
        String amountStr = String.valueOf(amount);
        for (int i = 0; i < amountStr.length(); i++) {
            // Extract each digit from the number and print the corresponding word
            int digit = Character.getNumericValue(amountStr.charAt(i));
            System.out.print(words[digit] + " ");
        }
        System.out.println();

        // Denomination breakdown
        System.out.println("DENOMINATION:");
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};

        for (int denomination : denominations) {
            if (amount >= denomination) {
                int count = amount / denomination;
                amount -= count * denomination;
                System.out.println(denomination + " X " + count + " = " + (denomination * count));
            }
        }
    }
}