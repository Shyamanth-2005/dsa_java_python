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


if __name__ == "__main__":
  main()
  