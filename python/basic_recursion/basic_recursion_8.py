def fibo(n):
  if n==0 or n==1:
    return n
  return fibo(n-1) + fibo(n-2)


def main():
  n = 5
  print(fibo(n))


if __name__ == "__main__":
  main()
