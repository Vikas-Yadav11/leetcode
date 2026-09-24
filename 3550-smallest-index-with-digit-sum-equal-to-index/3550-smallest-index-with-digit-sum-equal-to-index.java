class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int ans=0;
            while(num>0){
                int digit=num%10;
                ans=ans+digit;
                num=num/10;
            }
            if(ans == i){
                return i;
            }
        }
        return -1;
    }
}