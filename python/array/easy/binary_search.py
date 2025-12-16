def binary_search(arr,target):
  start = 0
  end = len(arr)-1
  while start <= end:
    mid = (start+end)//2
    if arr[mid] == target:
      return mid
    elif arr[mid] < target:
      start = mid+1
    else:
      end = mid -1
  return -1

def main():
  inp = list(map(int,input().split()))
  inp.sort()
  print(binary_search(inp,4))


if __name__ == "__main__":
  main()