package String_Problems;

import java.util.*;

public class Paranthesis_Checker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ans(s));
    }
    static boolean ans(String s){
        Stack<Character> ns=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{'||c=='['){
                ns.push(c);
            }
            else{
                if(ns.isEmpty()){
                    return false;
                }
                char ch=ns.pop();
                if(c==')' && ch!='(' || ch!='[' && c==']' || ch!='{' && c=='}')
                {
                return false;
                }
            }
        }
        return ns.isEmpty()? true:false;
        }
}
