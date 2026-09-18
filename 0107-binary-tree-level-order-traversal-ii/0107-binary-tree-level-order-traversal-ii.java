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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)  return ans;
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> temp=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode removed=queue.remove();
                if(removed.left!=null)  queue.add(removed.left);
                if(removed.right!=null)  queue.add(removed.right);
                temp.add(removed.val);
            }
            ans.add(0,temp);
        }
        return ans;
    }
}