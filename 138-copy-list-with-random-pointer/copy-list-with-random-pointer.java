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
        // HashMap<Node,Node> map=new HashMap<>();
        // Node newhead=new Node(head.val);
        // Node temp_2=newhead;
        // map.put(head,newhead);
        // Node temp=head.next;
        // while(temp!=null){
        //     temp_2.next=new Node(temp.val);
        //     temp_2=temp_2.next;
        //     map.put(temp,temp_2);
        //     temp=temp.next;
        // }
        // temp_2=newhead;
        // temp=head;
        // while(temp_2!=null){
        //     temp_2.random=map.get(temp.random);
        //     temp=temp.next;
        //     temp_2=temp_2.next;
        // }
        // return newhead;
        return method_2(head);
    }
    Node method_2(Node head){
        Node temp=head;
        while(temp!=null){
            Node t=new Node(temp.val);
            t.next=temp.next;
            temp.next=t;
            temp=temp.next.next;
        }
        temp=head;
        // Node temp_2=head.next;
        while(temp!=null){
                    Node temp_2 = temp.next;

        temp_2.random = temp.random == null
                ? null
                : temp.random.next;

        temp = temp.next.next;
        }
        Node t1=head;
        Node ans=head.next;
        Node t2=ans;
        while(t1!=null){
            t1.next = t1.next.next;
            if (t2.next != null) {
                t2.next = t2.next.next;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return ans;
    }
}