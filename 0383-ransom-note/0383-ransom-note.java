class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character,Integer> need=new HashMap<>();
            HashMap<Character,Integer> avl=new HashMap<>();
            for(int i=0;i<ransomNote.length();i++ ){
                char ch=ransomNote.charAt(i);
                need.put(ch,need.getOrDefault(ch,0)+1); 
            }
            for (int j=0;j<magazine.length();j++){
                char c=magazine.charAt(j);
                avl.put(c,avl.getOrDefault(c,0)+1);
            }
            for(char ch:need.keySet()){
                if(!avl.containsKey(ch)||need.get(ch)>avl.get(ch)){
                    return false;
                }
            }
            return true;
    }
}