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
    static ArrayList<Integer> nums;
    public int sumNumbers(TreeNode root) {
        nums=new ArrayList<>();
        traverse(root,root.val);
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums.get(i);
        }
        return sum;
    }
    public static void traverse(TreeNode root,int s){
        if(root.left==null && root.right==null){
            nums.add(s);
            return;
        }
        if(root.left!=null) traverse(root.left,s*10+root.left.val);
        if(root.right!=null)    traverse(root.right,s*10+root.right.val);
    }
}