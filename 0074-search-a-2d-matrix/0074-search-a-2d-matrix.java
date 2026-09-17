class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;   //row
        int m=  matrix[0].length;               //column
        int low=0;
        int high=m*n-1;

        while(low<=high){
            int guess=(low+high)/2;
            int row=guess/m;
            int column=guess%m;
            if(matrix[row][column]==target){
                return true;
            }
            else if(matrix[row][column]>target){
                high=guess-1;
            }
            else{
                low=guess+1;
            }

        }
        return false;
    }
}