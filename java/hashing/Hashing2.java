import java.util.*;

public class Hashing2 {
  public static int function(String s, char c) {
    int count = 0;
    for (char cin : s.toCharArray()) {
      if (c == cin) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char c = sc.nextLine().charAt(0);
    System.out.println(function(s, c));
    sc.close();
  }
}
