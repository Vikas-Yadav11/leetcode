class Solution {
    public boolean canAliceWin(int[] nums) {
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                one=one+nums[i];
            }
            else{
            two=two+nums[i];
            }
        }
        if(one!=two){
            return true;
        }
        return false;
    }
}