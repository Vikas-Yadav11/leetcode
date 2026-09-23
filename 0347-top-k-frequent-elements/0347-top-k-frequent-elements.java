class Pair{
    int num;
    int freq;
    Pair(int n,int f){
        num=n;
        freq=f;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)-> a.freq-b.freq);
        for(int num:map.keySet()){
            Pair p=new Pair(num,map.get(num));
            pq.add(p);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
        ans[i]=pq.poll().num;

        }
        return ans;
    }
}