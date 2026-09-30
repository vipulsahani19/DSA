/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        HashMap<Node,Node> map=new HashMap<>();
        Node newhead=new Node(head.val);
        Node temp_2=newhead;
        map.put(head,newhead);
        Node temp=head.next;
        while(temp!=null){
            temp_2.next=new Node(temp.val);
            temp_2=temp_2.next;
            map.put(temp,temp_2);
            temp=temp.next;
        }
        temp_2=newhead;
        temp=head;
        while(temp_2!=null){
            temp_2.random=map.get(temp.random);
            temp=temp.next;
            temp_2=temp_2.next;
        }
        return newhead;
    }
}