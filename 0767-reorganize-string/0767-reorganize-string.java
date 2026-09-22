class Pair{
     char ch;
    int freq;
    Pair(char c,int f){
        ch=c;
        freq=f;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    PriorityQueue<Pair>pq =new PriorityQueue<>((a,b)->b.freq-a.freq);
    for(char ch:map.keySet()){
        Pair p=new Pair(ch,map.get(ch));
        pq.add(p);
    }
    StringBuilder ans=new StringBuilder();
    Pair previous = null;
    while(!pq.isEmpty()){
         Pair current=pq.poll();
        ans.append(current.ch);
        current.freq--;
        if(previous!=null && previous.freq>0){
            pq.add(previous);
        }
        previous=current;
    }
    if(s.length()!=ans.length()){
        return "";    
    }
    return ans.toString();
}
}