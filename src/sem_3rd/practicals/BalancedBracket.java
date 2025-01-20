package sem_3rd.practicals;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Push the opening brackets onto the stack
                stack.push(c);
            } else {
                // If the stack is empty or the top of the stack doesn't match, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a combination of brackets: ");
        String input = scanner.nextLine();

        // Validate the input
        if (isValid(input)) {
            System.out.println("The combination of brackets is valid.");
        } else {
            System.out.println("The combination of brackets is not valid.");
        }

        scanner.close();
    }
}
