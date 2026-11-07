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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> set = new ArrayList<>();

        inorder(root, set);
        
        
        TreeNode root1 = set.get(0);
        TreeNode curr = root1;

        curr.left = null;
        for(int i=1; i<set.size(); i++){
           curr.right = set.get(i);
           curr = curr.right;
           curr.left = null;
        }
        curr.right = null;

        return root1;
    }
    public void inorder(TreeNode root, List<TreeNode> set){
        if(root == null){
            return;
        }

        inorder(root.left, set);
        set.add(root);
        inorder(root.right, set);
    }
}