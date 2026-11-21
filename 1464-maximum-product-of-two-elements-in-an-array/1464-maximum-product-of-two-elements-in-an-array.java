class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i< nums.length; i++){
            for(int j =i+1; j< nums.length; j++){
                int first = nums[i]-1;
                int second = nums[j] -1;
                pq.add(first * second);
            }
        }
        return pq.peek();
    }
}