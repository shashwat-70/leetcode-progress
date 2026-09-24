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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        if(root==null)  return ans;
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int max=Integer.MIN_VALUE;
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode removed=queue.remove();
                if(removed.val>max)  max=removed.val;
                if(removed.left!=null)  queue.add(removed.left);
                if(removed.right!=null) queue.add(removed.right);
            }
            ans.add(max);
        }
        return ans;
    }
}