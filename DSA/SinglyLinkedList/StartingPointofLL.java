package DSA.SinglyLinkedList;

import java.util.HashMap;

public class StartingPointofLL {
    public static void main(String[] args) {
        int arr[]={12,23,45,99};
        node head= node.convert(arr);

    }

    static node bruteStartingPoint(node head){
        node temp= head;
        HashMap<node,Integer> mpp= new HashMap<>();
        while(temp!=null){
            if(mpp.containsKey(temp)){

                return  temp;
            }
            mpp.put(temp,1);
            temp=temp.next;
        }
        return null;
    }

    static  node optimalStartingPoint(node head){
        node slow = head;
        node fast = head;

        // Step 1: Traverse the list to detect a loop
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;


            if (slow == fast) {
                return slow;
            }
        }



        return null;

    }


}
