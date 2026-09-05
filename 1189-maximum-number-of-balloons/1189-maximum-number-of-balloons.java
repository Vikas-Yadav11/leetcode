class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> need =new HashMap<>();
        HashMap<Character,Integer> avl =new HashMap<>();
        String word="balloon";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
            for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            avl.put(ch,avl.getOrDefault(ch,0)+1);
        }
        int ans=Integer.MAX_VALUE;
        for(char ch:need.keySet()){
            if(!avl.containsKey(ch)){
                return 0;
            }
            int count=avl.get(ch)/need.get(ch);
            ans=Math.min(ans,count);
            
        }

       return ans;

    }
}