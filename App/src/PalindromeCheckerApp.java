import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to the LinkedList
        for (int i = 0; i < text.length(); i++) {
            list.add(text.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}