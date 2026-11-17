package DSA.DoublyLinkedLIist;

public class check {
    public static void main(String[] args) {
        int arr[]={12,23,45,99};
        node head= node.converttoDLL(arr);
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
