
import java.util.Stack;

public class MinimumStack{
  Stack<Integer> mainStack ;
  Stack<Integer> minStack;

  public MinimumStack(){
    mainStack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int val){
    mainStack.push(val);
    if(minStack.isEmpty() || val <= minStack.peek()){
      minStack.push(val);
    }else{
      minStack.push(minStack.peek());
    }
  }

  public void pop(){
    if(!mainStack.isEmpty()){
      mainStack.pop();
      minStack.pop();
    }
  }
  public int top(){
    if(!mainStack.isEmpty()){
      return mainStack.peek();
    }
    throw new RuntimeException("Stack is Empty");
  }
  public int getMin(){
    if(!minStack.isEmpty()){
      return minStack.peek();
    }
    throw new RuntimeException("Stack is Empty");
  }
  public static void main(String[] args){
    MinimumStack stack = new MinimumStack();
    stack.push(5);
    stack.push(2);
    stack.push(7);
    stack.push(1);
    int minElement = stack.getMin();
    System.out.println(minElement);
    stack.pop();
    int topElement = stack.top();
    System.out.println(topElement);
    int newMinElement = stack.getMin();
    System.out.println(newMinElement);    
  }

}


