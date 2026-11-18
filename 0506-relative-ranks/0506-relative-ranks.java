class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        String[] ans = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            pq.add(new int[] { score[i], i });
        }

        int c = 1;
        while (!pq.isEmpty()) {
            int max[] = pq.poll();

            int index = max[1];

            if (c == 1) {
                ans[index] = "Gold Medal";

            } else if (c == 2) {
                ans[index] = "Silver Medal";

            } else if (c == 3) {
                ans[index] = "Bronze Medal";

            } else {
                 ans[index] = String.valueOf(c);
            }
             c++;

        }
        return ans;
    }
}