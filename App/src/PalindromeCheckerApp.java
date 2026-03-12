public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        if (check(text, 0, text.length() - 1)) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }

    // Recursive method to check palindrome
    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}