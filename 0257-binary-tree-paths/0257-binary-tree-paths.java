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
    static List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans=new ArrayList<>();
        if(root==null)  return ans;
        traverse(root,""+root.val);
        return ans;
    }
    public static void traverse(TreeNode root,String s){
        if(root.left==null && root.right==null){
            ans.add(s);
            return;
        }
        if(root.left!=null) traverse(root.left,s+"->"+root.left.val);
        if(root.right!=null) traverse(root.right,s+"->"+root.right.val);
    }
}