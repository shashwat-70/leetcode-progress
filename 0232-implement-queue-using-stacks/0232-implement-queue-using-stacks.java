//INSERT EFFICIENT QUEUE
// class MyQueue {
//     Stack<Integer> s1;
//     Stack<Integer> s2;

//     public MyQueue() {
//         s1=new Stack<>();
//         s2=new Stack<>();
//     }
    
//     public void push(int x) {
//         s1.push(x);
//     }
    
//     public int pop() {
//         while(!s1.isEmpty()){
//             int t=s1.pop();
//             s2.push(t);
//         }
//         int temp=s2.pop();
//         while(!s2.isEmpty()){
//             int t=s2.pop();
//             s1.push(t);
//         }
//         return temp;
//     }
    
//     public int peek() {
//         while(!s1.isEmpty()){
//             int t=s1.pop();
//             s2.push(t);
//         }
//         int temp=s2.peek();
//         while(!s2.isEmpty()){
//             int t=s2.pop();
//             s1.push(t);
//         }
//         return temp;
//     }
    
//     public boolean empty() {
//         return s1.isEmpty();
//     }
// }

// /**
//  * Your MyQueue object will be instantiated and called as such:
//  * MyQueue obj = new MyQueue();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.peek();
//  * boolean param_4 = obj.empty();
//  */

//REMOVE EFFICIENT QUEUE
 class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            int t=s1.pop();
            s2.push(t);
        }
        s2.push(x);
        while(!s2.isEmpty()){
            int t=s2.pop();
            s1.push(t);
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}