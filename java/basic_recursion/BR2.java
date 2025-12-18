public class BR2 {
  public static void printNumber(int n) {
    if (n == 1) {
      System.out.print(1 + " ");
      return;
    }
    //System.out.println(n); // before the recursion means in ascending order or reverse 
    printNumber(n-1);
    System.out.print(n+" "); // after the recursion means in desending order or normal
  }
  public static void main(String[] args) {
   printNumber(3); 
  }
}
