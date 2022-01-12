public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        return sb.toString().equals(sb.reverse().toString());
    }
}
