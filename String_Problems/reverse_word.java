package String_Problems;

import java.util.Scanner;

public class reverse_word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String rev=reverse(s);
        System.out.println(rev);
    }
    static String reverse(String s){
        StringBuilder res=new StringBuilder();
        int start=0;
        int end=s.length();
     for(int i=s.length()-1;i>=0;i--){
         char c=s.charAt(i);
         if(c==' '){

             res.append(s.substring(i+1,end));
             res.append(" ");
         end=i;}

     }
     res.append(s.substring(0, end));

        return res.toString().trim();
    }
}
