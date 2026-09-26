class Pair{
    char ch;
    int freq;
    Pair(char c,int f){
     ch=c;
     freq=f;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            char ch=tasks[i];
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(char ch:map.keySet()){
            Pair p=new Pair(ch,map.get(ch));
            pq.add(p);
        }
        int seat=0;
        while(!pq.isEmpty()){
            ArrayList<Pair>temp=new ArrayList<>();
         int cycle=n+1;
         while(cycle>0 && !pq.isEmpty()){
            Pair p=pq.poll();
            p.freq--;
            if(p.freq>0){
                temp.add(p);
            }
            seat++;
            cycle--; 
         }
         for (Pair p:temp){
            pq.add(p);
         }
         if(!pq.isEmpty()){
            seat=seat+cycle;
         }
        }
        return seat;
    }
}