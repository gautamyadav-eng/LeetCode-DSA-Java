/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
       HashMap<Integer, Integer> map = new HashMap<>();

        freq(root, map);

        int max =0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           max = Math.max(max, entry.getValue());
        }
        ArrayList<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }
        int[] ans = new int[result.size()];
        for(int i =0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
    public void freq(TreeNode root, HashMap<Integer,Integer> map){
        if(root == null){
            return ;
        }

        freq(root.left, map);
        freq(root.right, map);

        map.put(root.val,map.getOrDefault(root.val, 0) +1);
    }
}