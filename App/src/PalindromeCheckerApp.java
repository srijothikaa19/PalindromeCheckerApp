import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Build reversed string using stack
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}