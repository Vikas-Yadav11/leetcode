class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>f=new HashMap<>();
        int sum=0;
        int ans=0;
        f.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int oldsum=sum-k;  //sumis currentsum
          int count=f.getOrDefault(oldsum,0);
          ans=ans+count;
          f.put(sum,f.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}