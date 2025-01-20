package sem_3rd.practicals;

import java.util.*;

public class ReverseWordOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of sentences: ");
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();

        // Collect sentences
        while (n-- > 0) {
            text.append(scanner.nextLine()).append(" ");
        }

        // Clean and split text into words
        String[] words = text.toString().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");

        // Print words in reverse order
        Collections.reverse(Arrays.asList(words));
        System.out.println(String.join(" ", words));

        scanner.close();
    }
}
