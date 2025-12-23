def reverse_1(i,n,arr):
  if i >= n//2:
    return
  arr[i],arr[n-i-1] = arr[n-i-1],arr[i]
  reverse_1(i+1,n,arr)
def reverse(left,right,arr):
  if left >= right :
    return
  arr[left],arr[right] = arr[right],arr[left]
  reverse(left+1,right-1,arr)
def main():
  arr = [1,4,5,3,6]
  left = 0
  right = len(arr)-1
  
  reverse(left,right,arr)
  print(arr)
  print("\n")
  arr = [1,4,5,3,6]
  i = 0
  n = len(arr)
  reverse_1(i,n,arr)
  print(arr)

if __name__ == "__main__":
  main()
  