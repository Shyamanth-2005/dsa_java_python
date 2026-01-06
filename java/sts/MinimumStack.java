
import java.util.Stack;

public class MinimumStack {
  Stack<Integer> stack; // main stack
  Stack<Integer> minStack; // stores minimum

  public MinimumStack() {
    stack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int x) {
    stack.push(x);

    // push into minstack if it is the first element or if x <= current element
    if (minStack.isEmpty() || x <= minStack.peek()) {
      minStack.push(x);
    }
  }

  public void pop() {
    if (stack.isEmpty())
      return;
    int removed = stack.pop();
    // if removed element is the current minimum
    // pop it from minstack as well
    if (removed == minStack.peek()) {
      minStack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }

  public static void main(String[] args) {
    MinimumStack st = new MinimumStack();
    st.push(7);
    st.push(4);
    st.push(9);
    System.out.print(st.getMin());
  }
  
}
