import java.util.Stack;
// orginal sequence : [1,2,3]
// target : [2,1,3]
public class StackPermutation {
  public static boolean isStackPermutation(int[] orginal,int[] target){
    Stack<Integer> st = new Stack<>();
    int i = 0;
    for (int num : orginal) {
      st.push(num);
      while (!st.isEmpty() && st.peek() == target[i]) {
        st.pop();
        i++;
      }
    }
    return st.isEmpty();


  }
  public static void main(String[] args) {
    int[] orginal = { 1, 2, 3 };
    int[] target = { 2, 1, 3 };
    System.out.println(isStackPermutation(orginal, target));
  }
}
