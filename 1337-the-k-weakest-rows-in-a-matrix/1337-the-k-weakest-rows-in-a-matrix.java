class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]){
                return a[1] - b[1];
            }
            return a[0]- b[0];
        });

        int n = mat.length;
        for(int  i=0; i< n; i++){
        int count =0;
            for(int j =0; j< mat[i].length; j++){
                if(mat[i][j] == 1){
                    count ++;
                }
            }
            pq.add(new int[]{count, i});
        }

        int[] ans = new int[k];
        for(int i =0; i< k; i++){
            int[] weak = pq.poll();

            ans[i] = weak[1];
        }
        return  ans;
    }
}