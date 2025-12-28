import java.util.*;

public class Hashing1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arrSize = sc.nextInt();
    int[] arr = new int[arrSize];
    for (int i = 0; i < arrSize; i++) {
      arr[i] = sc.nextInt();
    }
    // pre compute
    int[] hash = new int[13];
    for (int num : arr) {
      hash[num] += 1;
    }
    int queryNo = sc.nextInt();
    while (queryNo >0) {
      int query = sc.nextInt();
      // fetch 
      System.out.println(hash[query]);
      queryNo--;
    }
  }
}
