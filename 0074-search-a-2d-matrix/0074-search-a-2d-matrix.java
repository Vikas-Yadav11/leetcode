class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;   //row
        int m=matrix[0].length;  //cloumn
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int guess=(low+high)/2;
            int row=guess/m; //m=column
            int column=guess%m;
            
            if(matrix[row][column]==target){
                return true;
            }
            else if(matrix[row][column]<target){
            low=guess+1;
        }else{
            high=guess-1;
        }
        }
        return false;
    }
}