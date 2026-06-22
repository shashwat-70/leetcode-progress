class MyLinkedList {
    
    private class Node{
        int val;
        Node next;

        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node a=new Node(val);
        if(size==0){
            head=a;
            tail=head;
            size++;
            return;
        }
        a.next=head;
        head=a;
        size++;
    }
    
    public void addAtTail(int val) {
        if(tail==null){
            addAtHead(val);
            return;
        }
        Node a=new Node(val);
        tail.next=a;
        tail=tail.next;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node a=new Node(val);
        a.next=temp.next;
        temp.next=a;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        size--;
        if(temp.next==tail){
            tail=temp;
        }
        temp.next=temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */