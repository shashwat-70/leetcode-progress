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
    static ArrayDeque<TreeNode> queue=new ArrayDeque<>();
    public void flatten(TreeNode root) {
        queue.clear();
        traverse(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.remove();
            node.right=queue.peek();
            node.left=null;
        }
    }
    private void traverse(TreeNode root){
        if(root==null){
            return;
        }
        queue.add(root);
        traverse(root.left);
        traverse(root.right);
    }
}