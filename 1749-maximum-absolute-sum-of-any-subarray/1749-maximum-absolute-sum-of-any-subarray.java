class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bestending=nums[0];
        int ans1=nums[0];
        int worstending=nums[0];
        int ans2=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=bestending+nums[i];
            int v2=nums[i];
            bestending=Math.max(v1,v2);
            ans1=Math.max(ans1,bestending);
            int v3=worstending+nums[i];
            int v4=nums[i];
            worstending=Math.min(v3,v4);
            ans2=Math.min(ans2,worstending);

        }
        return Math.max(ans1,Math.abs(ans2));
        
    }
}