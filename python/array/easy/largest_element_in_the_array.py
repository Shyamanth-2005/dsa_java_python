import sys
def largest_element(arr):
  max_element = -sys.maxsize-1
  for num in arr:
    if num > max_element:
      max_element = num
  return max_element
  

if __name__ == "__main__":
  arr1 = [2,5,1,3,0]
  arr2 = [8,10,5,7,9]
  print(largest_element(arr1))
  print(largest_element(arr2))