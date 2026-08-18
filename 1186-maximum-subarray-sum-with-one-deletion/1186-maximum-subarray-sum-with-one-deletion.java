class Solution {
    public int maximumSum(int[] arr) {
        int nodelete= arr[0];
        int ans=arr[0];
        int onedelete=arr[0];
        for(int i=1;i<arr.length;i++){
            onedelete=Math.max(onedelete+arr[i],nodelete);
            nodelete=Math.max(nodelete+arr[i],arr[i]);
            int best=Math.max(onedelete,nodelete);
            ans=Math.max(ans,best);
        }
        return ans;
        
    }
}