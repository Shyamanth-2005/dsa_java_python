def fact(num):
  if num == 1:
    return 1
  return num * fact(num-1)

def i_fact(num):
  total = 1
  for i in range(5,0,-1):
    total *= i
  return total

def main():
  num =  5
  print(fact(num))
  print(i_fact(num))


if __name__ == "__main__":
  main()
  