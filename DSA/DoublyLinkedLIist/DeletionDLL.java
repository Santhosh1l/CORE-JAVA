package DSA.DoublyLinkedLIist;

import java.util.Arrays;

public class DeletionDLL {
    public static void main(String[] args) {
        int arr[]={12,23,45,99};
        System.out.println(Arrays.toString(arr));
        node head= node.converttoDLL(arr);

      head=deleteattail(head);
      node.display(head);

    }
    static  node deleteathead(node head){
        if(head==null){
            return  null;
        }
        node temp= head.next;
       head=head.next;
       head.prev=null;
       temp.prev=null;
       return head;
    }
    static node deleteattail(node head){
        if(head==null || head.next==null){
            return head;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.prev.next=null;
      // temp.prev=null;s
        return  head;
    }
}
