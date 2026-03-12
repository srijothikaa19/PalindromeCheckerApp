import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();

        boolean result = strategy.check(text);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        if (result) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }

        System.out.println("Execution Time: " + duration + " nanoseconds");
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack-based palindrome algorithm
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equalsIgnoreCase(reversed);
    }
}