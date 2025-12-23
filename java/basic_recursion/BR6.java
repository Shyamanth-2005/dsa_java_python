public class BR6 {
  public static void reverse1(int[] arr, int n, int i) {
    if (i >= n / 2) {
      return;
    }
    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
    reverse1(arr, n, i+1);
    
  }
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
      System.out.print(num + " ");
    }
    System.out.println();
    int[] arr1 = { 1, 4, 5, 3, 6 };
    int n = arr.length;
    int i = 0;
    reverse1(arr1, n, i);
    for (int num : arr1) {
      System.out.print(num+" ");
    }
  }
}
