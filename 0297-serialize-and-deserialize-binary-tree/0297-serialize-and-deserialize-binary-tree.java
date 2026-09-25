/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    static StringBuilder sb;
    public static String serialize(TreeNode root) {
        if(root==null) return "[]";
        sb=new StringBuilder();
        sb.append("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode removed=queue.remove();
                if(removed==null){
                    sb.append("null");
                    sb.append(",");
                    continue;
                }  
                sb.append(""+removed.val);
                sb.append(",");
                queue.add(removed.left);
                queue.add(removed.right);
            }
        }
        while(!(sb.charAt(sb.length()-1)>='0' && sb.charAt(sb.length()-1)<='9')){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    
    public TreeNode deserialize(String data) {
        data=data.substring(1,data.length()-1);
        if(data.isEmpty())  return null;
        String[] values=data.split(",");
        int i=0;
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(values[i]));
        queue.add(root);
        i++;
        while(!queue.isEmpty() && i<values.length){
            TreeNode removed=queue.remove();
            if(i<values.length && !values[i].equals("null")){
                removed.left=new TreeNode(Integer.parseInt(values[i]));
                queue.add(removed.left);
            }
            i++;
            if(i<values.length && !values[i].equals("null")){
                removed.right=new TreeNode(Integer.parseInt(values[i]));
                queue.add(removed.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));