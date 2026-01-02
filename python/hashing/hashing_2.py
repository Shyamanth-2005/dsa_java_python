
def hashing_function(string,character):
  count = 0
  for char in string:
    if char == character:
      count +=1
  return count




def main():
  s = input("Enter your string: ")
  c = input("Enter your character: ")
  print(hashing_function(s,c))
  

if __name__ == "__main__":
  main()
  