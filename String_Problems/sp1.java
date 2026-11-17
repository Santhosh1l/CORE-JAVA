package String_Problems;

import java.util.Scanner;

public class sp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        ans(s1,s2);
    }
    static  void ans(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        System.out.println(l1+l2);
        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(Character.toUpperCase(s1.charAt(0))+ s1.substring(1, s1.length())+" "+Character.toUpperCase(s2.charAt(0))+s2.substring(1,s2.length()));
    }
}
