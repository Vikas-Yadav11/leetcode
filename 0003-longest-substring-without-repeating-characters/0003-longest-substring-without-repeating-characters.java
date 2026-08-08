class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        int low=0;
        int ans=0;

        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            int count=map.getOrDefault(ch,0);
            count++;
            map.put(ch,count);
            while(map.get(ch)>1){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));

                }
                low++;
                
            }
            ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}