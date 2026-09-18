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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)  return ans;
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        int flg=1;
        while(!queue.isEmpty()){
            int n=queue.size();
            ArrayList<Integer> temp=new ArrayList<>();
            if(flg==1){
                for(int i=0;i<n;i++){
                    TreeNode remove=queue.removeFirst();
                    if(remove.left!=null)   queue.addLast(remove.left);
                    if(remove.right!=null)  queue.addLast(remove.right);
                    temp.add(remove.val);
                }
                flg=-1;
            }
            else{
                for(int i=0;i<n;i++){
                    TreeNode remove=queue.removeLast();
                    if(remove.right!=null)   queue.addFirst(remove.right);
                    if(remove.left!=null)  queue.addFirst(remove.left);
                    temp.add(remove.val);
                }
                flg=1;
            }
            ans.add(temp);
        }
        return ans;
    }
}