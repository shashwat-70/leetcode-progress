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
    static int count;
    public int pathSum(TreeNode root, int targetSum) {
        count=0;
        if(root==null)  return count;
        caller(root,targetSum);
        return count;
    }
    public static void caller(TreeNode root,int target){
        traverse(root,root.val,target);
        if(root.left!=null) caller(root.left,target);
        if(root.right!=null)    caller(root.right,target);
    }
    public static void traverse(TreeNode root,long sum,int target){
        if(sum==target){
            count++;
        }
        if(root.left!=null) traverse(root.left,sum+root.left.val,target);
        if(root.right!=null) traverse(root.right,sum+root.right.val,target);
    }
}