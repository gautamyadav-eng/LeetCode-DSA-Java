class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int freq[] = new int[n*n+1];
        int ans[] = new int[2];
        for(int i =0; i<n; i++){
            for(int j =0; j< n; j++){
                freq[grid[i][j]]++;
            }
        }
        for(int k =1; k<=n*n; k++){
            if(freq[k] == 2){
                ans[0] = k;
            }
            if(freq[k] == 0){
                ans[1] = k;
            }
        }
        return ans;
    }
}