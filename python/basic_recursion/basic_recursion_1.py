# def print_name(n):
#   if n <= 0 :
#     return " "
#   return "Shyamanth " + print_name(n-1)
  
  
# if __name__ == '__main__':
#   n = 4
#   print(print_name(n))

class Solution:
  def print_name(self,name,count,N):
    if count == N:
      return 
    print(name,end = " ")
    return self.print_name(name,count+1,N)
  
def main():
  sol = Solution()
  name = "Shyamanth"
  N = 23
  sol.print_name(name,0,N)
  
  
if __name__ == "__main__":
  main()