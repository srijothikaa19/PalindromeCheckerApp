import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(text);

        if (result) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Concrete Strategy using Stack
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