package DSA.SinglyLinkedList;
class node{
    node head;
    int data;
    node next;
    node(int data1,node next){
        this.data=data1;
        this.next=next;

    }
    node(int data){
        this.data=data;
        this.next=null;
    }
static  node convert(int arr[]){
    node head= new node(arr[0]);
    node mover=head;
    for(int i=0;i<arr.length;i++){
        node temp=new node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head.next;
}
    static  void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class LinkedList{
    node head;
    node add(int data){
        node newNode = new node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode;
        }
        return head;
    }
    static node convert(int arr[] ){
        node head= new node(arr[0]);
        node mover=head;
        for(int i=0;i<arr.length;i++){
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head.next;
    }

    static  void display(node  head){
        node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }


}

