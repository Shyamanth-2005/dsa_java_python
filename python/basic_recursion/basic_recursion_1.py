def print_name(n):
  if n <= 0 :
    return " "
  return "Shyamanth " + print_name(n-1)
  
  
if __name__ == '__main__':
  n = 4
  print(print_name(n))