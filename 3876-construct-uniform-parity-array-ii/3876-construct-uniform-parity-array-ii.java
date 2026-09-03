class Solution {
    public boolean uniformArray(int[] nums1) {
        int minodd=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                minodd=Math.min(minodd,nums1[i]);
            }
        }
            if(minodd==Integer.MAX_VALUE){
                return true;
            }
            for(int j=0;j<nums1.length;j++){
                if(nums1[j]%2==0 &&nums1[j]<minodd){
                    return false;
                }
            
        }
        return true;
    }
}