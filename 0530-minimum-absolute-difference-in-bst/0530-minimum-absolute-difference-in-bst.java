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
    public int getMinimumDifference(TreeNode root) {
       ArrayList<Integer> allValues = new ArrayList<>();

       inorder(root, allValues);

       int min = Integer.MAX_VALUE;
       for(int i=1; i<allValues.size(); i++){
        int diff = allValues.get(i) - allValues.get(i-1);
            if(diff <min){
                min =diff;
            }
        
       } 

       return min;
       
    }
    public void inorder(TreeNode root, ArrayList<Integer> allValues){
        if(root == null){
            return ;
        }
        inorder(root.left, allValues);
        allValues.add(root.val);
        inorder(root.right, allValues);
    }
}