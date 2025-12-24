public class BR7 {
  public static boolean checkPalindrome(int i, int n, String s) {
    if (i >= n / 2) {
      return true;
    }
    if (s.charAt(i) != s.charAt(n - i - 1)) {
      return false;
    }
    return checkPalindrome(i + 1, n, s);
  }

  public static void main(String[] args) {
    String s = "madam";
    int n = s.length();
    int i = 0;
    System.out.println(checkPalindrome(i, n, s));
    
  }
}
