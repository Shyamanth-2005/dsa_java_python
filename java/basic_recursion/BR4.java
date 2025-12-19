public class BR4 {
  public static int sumOfNumbers(int n) {
    if (n == 1) {
      return 1;
    }
    return n + sumOfNumbers(n - 1);
  }
  public static void main(String[] args) {
    int n = 5;
    System.out.println(sumOfNumbers(n));
  }
}