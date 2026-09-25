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
    static ArrayList<Integer> arr;
    public int kthSmallest(TreeNode root, int k) {
        arr=new ArrayList<Integer>();
        inorderTraversal(root);
        return arr.get(k-1);
    }
    public static void inorderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
    }
}