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
    public boolean isCousins(TreeNode root, int x, int y) {
        int Xh=NodeHeight(root,x,0);
        int Yh=NodeHeight(root,y,0);
        return (Xh==Yh) && (!isSibling(root,x,y));
    }
    
    private static int NodeHeight(TreeNode root,int val,int h){
        if(root==null){
            return -1;
        }
        if(root.val==val){
            return h;
        }
        int height=NodeHeight(root.left,val,h+1);
        if(height!=-1){
            return height;
        }
        return NodeHeight(root.right,val,h+1);
    }
    private static boolean isSibling(TreeNode root,int x,int y){
        if(root==null || (root.left==null && root.right==null)){
            return false;
        }
        if(root.left!=null && root.right!=null){
            if((root.left.val==x && root.right.val==y) || (root.left.val==y && root.right.val==x)){
                return true;
            }
        }
        return isSibling(root.left,x,y) || isSibling(root.right,x,y);
    }
}