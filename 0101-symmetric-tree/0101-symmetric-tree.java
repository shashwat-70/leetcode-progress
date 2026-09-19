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
    public boolean isSymmetric(TreeNode root) {
        return func(root,root);
    }
    private boolean func(TreeNode m,TreeNode n){
        if(m==null && n==null){
            return true;
        }
        if(m!=null && n==null || m==null && n!=null || m.val!=n.val){
            return false;
        }
        return func(m.left,n.right) && func(m.right,n.left);
    }
}