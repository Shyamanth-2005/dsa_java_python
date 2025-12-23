public class BR6 {
  public static void reverse(int left, int right, int[] arr) {
    if (left >= right) {
      return;
    }
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    reverse(left+1, right-1, arr);
    
  }
  public static void main(String[] args) {
    int[] arr = { 1, 4, 5, 3, 6 };
    int left = 0;
    int right = arr.length - 1;
    reverse(left, right, arr);
    for (int num : arr) {
      System.out.print(num+" ");
    }
  }
}
