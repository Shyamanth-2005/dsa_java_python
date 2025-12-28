def main():
  arr = []
  arr_size = int(input("Enter your arr size: "))
  count = 0
  while (count < arr_size):
    number = int(input("Enter your element: "))
    arr.append(number)
    count += 1
  
  # pre compute
  hash = [0] * 12
  for num in arr:
    hash[num] += 1
    
  query = int(input("Enter the number of query's you want: "))
  while (query > 0):
    number = int(input("Enter the number you want to check the frequency: "))
    # fetch
    print(hash[number])
    query -= 1


    


if __name__ == "__main__":
  main()