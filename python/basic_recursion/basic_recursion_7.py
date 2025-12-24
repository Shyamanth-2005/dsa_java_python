def check_palindrome(i,n,s):
  if i >= n//2:
    return True
  if s[i] != s[n-i-1]:
    return False
  return check_palindrome(i+1,n,s)

def main():
  s = "madsm"
  n = len(s)
  i = 0
  print(check_palindrome(i,n,s))
  
if __name__ == "__main__":
  main()
  