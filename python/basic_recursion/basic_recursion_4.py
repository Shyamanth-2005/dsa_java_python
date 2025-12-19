def sum_of_num(n):
  if n == 1:
    return 1
  return n + sum_of_num(n-1)

def main():
  n = 4
  print(sum_of_num(n))
  
if __name__ == "__main__":
  main()
  