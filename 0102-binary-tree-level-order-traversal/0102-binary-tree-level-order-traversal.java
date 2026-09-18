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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> temp=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode tem=queue.remove();
                temp.add(tem.val);
                if(tem.left!=null)    queue.add(tem.left);
                if(tem.right!=null)    queue.add(tem.right);
            }
            arr.add(temp);
        }
        return arr;
    }
}