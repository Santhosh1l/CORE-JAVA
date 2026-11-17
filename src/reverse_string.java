package src;

import java.util.ArrayList;
import java.util.*;

public class reverse_string {
    public static void main(String[] args) {
        String str = "i like this program very much";

        System.out.println(revStack(str));
        System.out.print(reverse(str));
    }


    static String reverse(String s){
        int end=s.length();
        String s1="";
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)== ' '){
                //System.out.println(s.substring(i+1,end)+" ");
                s1+=s.substring(i+1,end)+" ";
             //   s1.append(" ");
                end=i;}}
        //s1.append(s.substring(0,end));
        s1+=s.substring(0,end);
    return  s1.toString();
    }


static  String revStack(String s){
    int left = 0;
    int right = s.length() - 1;

    String temp = "";
    String ans = "";
    while (left <= right)
    {
        char ch = s.charAt(left);
        if (ch != ' ')
        {
            temp += ch;
        }
        else if (ch == ' ')
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
            temp = "";
        }
        left++;
    }

    //If not empty string then add to the result(Last word is added)
    if (!temp.equals(""))
    {
        if (!ans.equals(""))
        {
            ans = temp + " " + ans;
        }
        else
        {
            ans = temp;
        }
    }

    return ans;
}
}