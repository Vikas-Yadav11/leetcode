class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0;
        int ans=0;
        int maxcount=0;
        
        for(int high=0;high<nums.length;high++){
            if(nums[high]==1){
                maxcount++;
            }
            while((high-low+1)-maxcount>k){
                if(nums[low]==1){
                    maxcount--;
                }
                low++;
            }
ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}