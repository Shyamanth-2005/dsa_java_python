def print_number(n):
  # base conditon
  if n == 1:
    print(n,end=" ")
    return
  # forward pass
  print(n,end=" ")
  print_number(n-1)
  
def main():
  n = 4
  print_number(n)

if __name__ == "__main__":
  main()
  
