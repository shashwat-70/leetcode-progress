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
    static List<Integer> ans;
    public List<Integer> inorderTraversal(TreeNode root) {
        ans=new ArrayList<Integer>();
        traverse(root,ans);
        return ans;
        
    }
    private static void traverse(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        traverse(root.left,ans);
        ans.add(root.val);
        traverse(root.right,ans);
    }
}