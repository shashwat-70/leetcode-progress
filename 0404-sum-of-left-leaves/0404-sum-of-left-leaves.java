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
    static int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        traverse(root);
        return sum;
    }
    public static void traverse(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                sum+=root.left.val;
            }
            traverse(root.left);
        }
        if(root.right!=null){
            traverse(root.right);
        }
    }
}