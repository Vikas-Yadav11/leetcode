class Solution {
    public String removeDuplicates(String s, int k) {
       Stack<int []> stack=new Stack<>();
       for (int i=0;i<s.length();i++){
        char ch=s.charAt(i);
       if(!stack.isEmpty() && stack.peek()[0]==ch){
        stack.peek()[1]++;
        if(stack.peek()[1]==k){
            stack.pop();
        }
       } else{
        stack.push(new int[]{ch,1});
       }
       }
       StringBuilder ans=new StringBuilder();
       for (int i=0;i<stack.size();i++){
        int pair[]=stack.get(i);
        char ch=(char)pair[0];
        int count=pair[1];
        while(count>0){
            ans.append(ch);
            count--;
        }
       }
       return ans.toString();
    }
}