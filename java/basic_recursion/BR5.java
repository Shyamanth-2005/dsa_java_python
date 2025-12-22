public class BR5 {
  public static int fact(int num) {
    // base condition

    if (num == 1) {
      return 1;
    }
    // return condition
    return num * fact(num - 1);
  }

  public static int iFact(int num) {
    // initialization
    int total = 1;
    // maintanence
    for (int i = num; i > 0; i--) {
      total *= i;
    }
    // termination
    return total;
    
  }

  public static void main(String[] args) {
    int N = 5;
    System.out.println(iFact(N));
    System.out.println(fact(N));
  }
}
