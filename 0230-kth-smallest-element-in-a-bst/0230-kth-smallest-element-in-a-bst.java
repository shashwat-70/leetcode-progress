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
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        return kthSmall(root,k).val;
    }

    static int count;
    public TreeNode kthSmall(TreeNode root, int k) {
        if(root==null){
            return null;
        }
        TreeNode left= kthSmall(root.left,k);
        if(left!=null)  return left;

        //The ++count means: I have now visited one more node.
        //If this is the kth node: return root;
        if(++count==k)  return root;
        
        return kthSmall(root.right,k);
    }
}