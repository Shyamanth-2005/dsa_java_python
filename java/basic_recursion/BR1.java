

/*
What is recursion ?

A recurion is a programming technique where the function calls itself directly or indirectly to solve a problem , by breaking the
problem into smaller sub-problems until it reaches a base conditon that stops further calling of the function

crutial components  = >  base conditon and stack overflow

stack overflow , ie when the base condition is not defined properly the function may call itself indefnitely until it reachs the 
memory limit of the recursion stack (1000/999) and throws an error of segmentation fault


Advantages of Recursion:
-  Simple / simplifies the code
- Natural way of representation
-  code complexity is less
- it used in divide and conquer algorithms

DisAdvantages of Recursion:
- High memory usage
- risk of stack overflow
- It is slow in execution
- hard to debug


*/

public class BR1 {

  public static String printName(int n) {
    if(n <= 0){
      return " ";
    }
    return "Shyamanth " + printName(n-1);
  }
  
  public static void main(String[] args) {
    int n = 3;
    System.out.println(printName(n));
    
  }
}
