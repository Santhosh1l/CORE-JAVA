package DSA.SinglyLinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class insertion {
    static  node insertAtStarting(node head, int val){

        System.out.println("Inesert at Head");
        node temp= new node(val,head);


        return temp;
    }
    static  node insertAtending(node head, int val){
        System.out.println();
        System.out.println("Inesert at Tail");
        if(head==null){
            return new node(val);
        }
        node newnode=new node(val);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newnode;
        return head;
    }
    static node insertAtanyPoistion(node head, int value, int position){
        node newNode= new node(value);
        node temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if (position > count + 1 || position < 1) {
            // System.out.println("Wrong position");
            return head;

        }

        // If inserting at the head
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }


        temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        newNode.next= temp.next;
        temp.next = newNode;


        return head;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={20, 6, 2, 19, 7, 4, 15, 9};
        System.out.println(Arrays.toString(arr));
        node head= node.convert(arr);

        node.display(insertAtanyPoistion(head,3,20));
    }}