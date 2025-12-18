class Solution:
  
  def print_name(self,current,N):
    if current >N:
      return
    print(current,end=" ")
    self.print_name(current+1,N)
    
    
  
def main():
  sol = Solution()
  current = 1
  N = 5
  sol.print_name(current,N)
  
if __name__ == "__main__":
  main()