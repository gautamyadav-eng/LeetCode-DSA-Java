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
    public boolean isBalanced(TreeNode root) {
       if(root == null){
        return true ;
       }
       int leftHeight = rootHeight(root.left);
       int rightHeight = rootHeight(root.right);

       if(Math.abs(leftHeight - rightHeight) > 1 ){
        return false; 
       }
       if(!isBalanced(root.left)){
        return false;
       }
        if(!isBalanced(root.right)){
        return false;
       }
       return true;
    }

    public int rootHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxheight  = 0;
        int lh = rootHeight(root.left);
        int rh = rootHeight(root.right);

        maxheight += Math.max(lh, rh) + 1;
        return maxheight;
    }
}