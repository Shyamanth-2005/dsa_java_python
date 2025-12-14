
public class LargestElementInTheArray{
  public static int largestElement(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr1 = {2,5,1,3,0};
    int[] arr2 = {8,10,5,7,9};
    System.out.println(largestElement(arr1));
    System.out.println(largestElement(arr2));
  }
}