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
    public int minDepth(TreeNode root) {
        if(root==null)  return 0;
        return minD(root,0);
    }
    public int minD(TreeNode node,int h){
        if(node==null){
            return Integer.MAX_VALUE;
        }
        if(node.right==null && node.left==null){
            return h+1;
        }
        int l=minD(node.left,h+1);
        int r=minD(node.right,h+1);
        return l<=r?l:r;
    }
}