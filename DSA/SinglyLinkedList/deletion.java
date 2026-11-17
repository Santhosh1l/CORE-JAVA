package DSA.SinglyLinkedList;

import java.util.Arrays;

public class deletion {


    static node deleteHead(node head){
        if(head==null) return null;
        head=head.next;
        return head;
    }
    static node deleteTail(node head){
        if(head==null || head.next==null) return null;
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    static node deleteN(node head, int position) {

        if (head == null) return null; // Handle empty list

        if (position == 0) {
            return head.next; // Move head to the next node
        }

        node temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int arr[]={20, 6, 2, 19, 7, 4, 15, 9};
        System.out.println(Arrays.toString(arr));
        node head= node.convert(arr);
        // delete head
        // head=deleteHead(head);
        head=deleteN(head, 3);
        System.out.println("Delete at given poistion");
        node.display(head);

    }
}
