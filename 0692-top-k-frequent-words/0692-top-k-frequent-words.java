class Pair{
    String word;
    int freq;
    Pair(String w,int f){
        word=w;
        freq=f;
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq != b.freq) {
                return a.freq - b.freq;
            }
            return b.word.compareTo(a.word);
        });

        for(String s:map.keySet()){
            Pair p=new Pair(s,map.get(s));
            pq.add(p);
            if(pq.size()>k){
                pq.poll();
            }
        }
        String ans[]=new String[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=pq.poll().word;
        }
        return Arrays.asList(ans);
    }
}