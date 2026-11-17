package DSA.SinglyLinkedList;



public class reverseLL {
    public static void main(String[] args) {

        int arr[] = {12, 23, 45, 99};
        node head = node.convert(arr);
        head = reveser(head);
        node.display(head);
        System.out.println();
       node.display(recursionrevese(head));

    }

    static node reveser(node head) {
        node prev = null;
        node temp = head;
        while (temp != null) {
            node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    static  node recursionrevese(node head){
        if(head==null || head.next==null){
            return null;
        }
        node newhead=reveser(head.next);
        node front=head.next;
        front.next=head;
        head.next=null;
        return  newhead;
    }
}