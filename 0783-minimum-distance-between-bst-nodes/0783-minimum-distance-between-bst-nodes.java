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
      ArrayList<Integer> set = new ArrayList<>();

      inorder(root, set);

      int min = Integer.MAX_VALUE;
       for(int i=1; i< set.size(); i++){
        int diff = set.get(i) - set.get(i-1);

        min = Math.min(min , diff);
       }
       return min;
    }

    public void inorder(TreeNode root, ArrayList<Integer> set){
        if(root == null){
            return ;
        }
        inorder(root.left, set);
        set.add(root.val);
        inorder(root.right, set);

    }

}