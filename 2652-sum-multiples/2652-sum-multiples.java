class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
           int digit=i;
            if(digit%3==0 ||digit%5==0 || digit%7==0){
                sum+=digit;
            }
        }
        return sum;
    }
}