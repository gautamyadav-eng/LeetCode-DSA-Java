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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();

        inorder(root, set);

        for(int num: set){
            int remaining = k-num;

            if(set.contains(remaining) && remaining != num ){
                return true;
            }
        }
        
        return false;
    }
    public void inorder(TreeNode root, HashSet<Integer> set){
        if(root == null){
            return ;
        }

        inorder(root.left, set);
        inorder(root.right, set);

        set.add(root.val);
    }
}