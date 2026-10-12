class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        fun(candidates,candidates.length,0,diary,0,res,target);
        return res;
    }
    void fun(int arr[],int n,int idx,List<Integer>diary,int sum,List<List<Integer>>res,int target){
        if(idx==n){
            if(sum==target){
                res.add(new ArrayList<>(diary));
            }
            return;
        }
        if(sum+arr[idx]<=target){
            diary.add(arr[idx]);
            fun(arr,n,idx,diary,sum+arr[idx],res,target);
            diary.remove(diary.size()-1);
        }
        
            fun(arr,n,idx+1,diary,sum,res,target);
    }
}