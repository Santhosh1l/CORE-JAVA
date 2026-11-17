package DSA.DoublyLinkedLIist;

class node{
    int data;
    node prev;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

    node(int data,node prev,node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
static node converttoDLL(int arr[]){
        node head=new node(arr[0]);
        node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new node(arr[i]);
            temp.next.prev=temp;
            temp=temp.next;

        }
return  head;
    }
   static void display(node head){
        node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

    public class DLL{
        public static void main(String[] args) {
            int arr[]={12,23,45,99};
            node head= node.converttoDLL(arr);

            node.display(head);
        }
    }


