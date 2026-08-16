class Solution {
    public boolean isHappy(int n) {
      int slow=n;
      int fast=n;
      while(true){
        slow=func(slow);
        fast=func(fast);
        fast=func(fast);
        if(fast==1){
            return true;
        }
        if(fast==slow ){
            return false;
        }
      }
    
    }
    public int func(int n){
     int sum=0;
      while(n>0){
        int digit=n%10;
        sum=sum+digit*digit;
        n=n/10;
      }
      return sum;
    }
}