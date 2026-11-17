package String_Problems;

import java.util.Scanner;

public class practice_String {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ans(s));
    }
    static  String ans(String s){
        int [] fe=new int[256];
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            fe[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(fe[s.charAt(i)]==1){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
