package iilm.java.practicals;


public class pattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print increasing sequence
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print decreasing sequence
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

