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
    static int pre;//determines the root at each recursive call

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre=0;
        return buildTree(preorder,inorder,0,inorder.length-1);
    }
    
    public TreeNode buildTree(int[] preorder,int[] inorder,int inleft,int inright){
        if(inleft>inright){//no child available return null
            return null;
        }

        TreeNode root=new TreeNode(preorder[pre]);//create the TreeNode for current node
        
        int idx=-1;//find the node created in inorder so that its right and left child can be determined correctly
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==root.val){
                idx=i;
            }
        }

        pre++;

        //make a recursive call for left and right child
        root.left=buildTree(preorder,inorder,inleft,idx-1);
        root.right=buildTree(preorder,inorder,idx+1,inright);

        //once the node is completely built with both its child return it
        return root;
    }
}