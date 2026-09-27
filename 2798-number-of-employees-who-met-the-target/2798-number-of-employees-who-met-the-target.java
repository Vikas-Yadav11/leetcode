class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            int num=hours[i];
            if(num>=target){
                count++;
            }

        }
        return count;
        
    }
}