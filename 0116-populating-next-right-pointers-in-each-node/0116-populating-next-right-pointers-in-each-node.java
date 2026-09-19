/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    //Basic BFS just store the nodes level wise and join them
    // public Node connect(Node root) {
    //     if(root==null)  return root;
    //     List<List<Node>> nodes=new ArrayList<>();
    //     ArrayDeque<Node> queue=new ArrayDeque<>();
    //     queue.add(root);
    //     while(!queue.isEmpty()){
    //         List<Node> temp=new ArrayList<>();
    //         int n=queue.size();
    //         for(int i=0;i<n;i++){
    //             Node removed=queue.remove();
    //             if(removed.left!=null)  queue.add(removed.left);
    //             if(removed.right!=null)  queue.add(removed.right);
    //             temp.add(removed);
    //         }
    //         nodes.add(temp);
    //     }
    //     for(int i=0;i<nodes.size();i++){
    //         for(int j=0;j<nodes.get(i).size()-1;j++){
    //             nodes.get(i).get(j).next=nodes.get(i).get(j+1);
    //         }
    //         nodes.get(i).get(nodes.get(i).size()-1).next=null;
    //     }
    //     return root;
    // }

    //Optimal recursive solution
    // public Node connect(Node root) {
    //     if(root==null || root.left==null){
    //         return root;
    //     }
    //     root.left.next=root.right;
    //     if(root.next!=null) root.right.next=root.next.left;
    //     connect(root.left);
    //     connect(root.right);
    //     return root;
    // }

    //Optimal iterative solution
    public Node connect(Node root){
        if(root==null){
            return null;
        }
        Node leftt=root;
        while(leftt.left!=null){
            Node curr=leftt;
            while(curr!=null){
                curr.left.next=curr.right;
                if(curr.next!=null)    curr.right.next=curr.next.left;
                curr=curr.next;
            }
            leftt=leftt.left;
        }
        return root;
    }
}