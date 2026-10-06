class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start =0;
        int end = matrix.length * matrix[0].length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            int value = matrix[row][col];

            if(value == target){
                return true;
            }else if(value < target){
                start = mid+1;

            }else{
                end = mid-1;
            }
        }
        return false;
        
    }
}