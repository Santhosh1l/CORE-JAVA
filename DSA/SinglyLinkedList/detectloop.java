package DSA.SinglyLinkedList;

import java.util.*;

public class detectloop {


        static boolean brute_detect(node head){
            node temp= head;
            HashMap<node,Integer> mpp= new HashMap<>();
            while(temp!=null){
              if(mpp.containsKey(temp)){

                  return  true;
              }
              mpp.put(temp,1);
            temp=temp.next;
            }
            return false;
        }
static  boolean optimaldetectloop(node head){

            node slow=head;
            node fast=head;
            while(fast!=null && fast.next!=null){
                if(fast==slow){
                    return true;
                }
                fast=fast.next.next;
                slow =slow.next;
            }

            return  false;
}

    public static void main(String[] args) {
        int arr[]={12,23,45,99};
        node head= node.convert(arr);
        boolean check=brute_detect(head);
        if(check==true){
            System.out.println("It have loop");
        }
        else{
            System.out.println("no");
        }
    }
}
