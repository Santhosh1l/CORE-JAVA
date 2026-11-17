package String_Problems;

import java.util.Scanner;

public class expand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ans(s));
    }
    static String ans(String s){
        StringBuilder res= new StringBuilder();
        for(int i=0;i<s.length();i=i+2){
            char c=s.charAt(i);
            int n=Character.getNumericValue(s.charAt(i+1));
            for(int j=0;j<n;j++){
                res.append(c);
            }
        }
    return res.toString();
    }

}
