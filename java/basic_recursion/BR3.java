public class BR3 {
  public static void printNumber(int n) {
    if (n == 1) {
      System.out.print(n+" ");
      return;
    }
    System.out.print(n+" ");
    printNumber(n - 1);

  }
  public static void main(String[] args) {
    int n = 4;
    printNumber(n);
  }
}
