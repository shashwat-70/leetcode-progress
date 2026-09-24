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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)  return false;
        return sum(root,targetSum-root.val);
    }
    public static boolean sum(TreeNode root,int targetSum){
        //you reached a leaf node where target sum is achieved
        if(targetSum==0 && root.right==null && root.left==null){
            return true;
        }

        //move to left or right or both path if its not null
        //if its null it cant be the desired path so false
        boolean left=false;
        boolean right=false;
        if(root.left!=null)    left=sum(root.left,targetSum-root.left.val);
        if(root.right!=null)    right=sum(root.right,targetSum-root.right.val);
        
        //return true if any of the path is correct
        return left || right;
    }
}