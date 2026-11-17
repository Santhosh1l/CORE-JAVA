package String_Problems;

import java.util.Scanner;

public class LastNon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(rep(s));
    }
    static  char rep(String s){
        int fre[]=new int[256];
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)]++;
        }
        for(int i=s.length()-1;i>=0;i--){
            if(fre[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '0';
    }
}
