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
    public int minDiffInBST(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
       
       miniDistance(root, ans);

       int minValue = Integer.MAX_VALUE;

       for(int i =1; i<ans.size(); i++){
       int diff = ans.get(i) - ans.get(i - 1);
        minValue = Math.min(minValue, diff);
       }

       return minValue;
    }
    public static void miniDistance(TreeNode root, List<Integer> ans){
        if(root == null){
            return ;
        }
        miniDistance(root.left, ans);
        ans.add(root.val);
        miniDistance(root.right, ans);

    }
}