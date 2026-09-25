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
    static int max;
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        sum(root);
        return max;
    }
    
    public static int sum(TreeNode root){
        if(root==null){
            return 0;
        }

        int ro=root.val;
        int l=Math.max(0,sum(root.left));
        int r=Math.max(0,sum(root.right));

        max=Math.max(max,ro+l+r);//ro+l+r -> local maximum

        return Math.max(l+ro,r+ro);//whats to be passed to other calls to create a valid path
    }
}