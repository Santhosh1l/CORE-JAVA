package String_Problems;

import java.util.Scanner;

public class frequencybyarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       ans(s);
    }
    static void ans(String s){
        int arr[]=new int[256];
        boolean[] printed = new boolean[256];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!printed[c]){
            System.out.println(s.charAt(i)+" : "+arr[s.charAt(i)]);
            printed[c]=true;}
        }
    }
}
