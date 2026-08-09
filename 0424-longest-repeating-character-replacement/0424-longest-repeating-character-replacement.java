class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int low=0;
        int maxcount=0;
        int ans=0;
        for(int high=0;high<s.length();high++){
            freq[s.charAt(high)-'A']++;
            maxcount=Math.max(maxcount,freq[s.charAt(high)-'A']);
            while((high-low+1)-maxcount>k){
                freq[s.charAt(low)-'A']--;
                low++;
            }
            ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}