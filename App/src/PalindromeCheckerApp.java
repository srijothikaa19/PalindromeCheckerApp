public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(text);

        if (result) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}

// Service class that contains palindrome logic
class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}