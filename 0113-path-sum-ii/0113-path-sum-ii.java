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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ans=new ArrayList<>();
        if(root==null)  return ans;
        List<Integer> list=new ArrayList<Integer>();
        list.add(root.val);
        traverse(root,root.val,targetSum,list);
        return ans;
    }
    static List<List<Integer>> ans;
    public static void traverse(TreeNode root,int sum,int target,List<Integer> list){
        if(root.left==null && root.right==null){
            if(sum==target)  ans.add(list);
            return;
        }
        if(root.left!=null) {
            List<Integer> temp=new ArrayList<>(list);
            temp.add(root.left.val);
            traverse(root.left,sum+root.left.val,target,temp);
        }
        if(root.right!=null){
            List<Integer> temp=new ArrayList<>(list);
            temp.add(root.right.val);
            traverse(root.right,sum+root.right.val,target,temp);
        } 
    }
}