package src;
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {


        String st[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String res = commonprefix(st);
        if(res.isEmpty()){
            System.out.println("no common");
        }
        System.out.println(res);

    }
    static String commonprefix(String st[]){
        Arrays.sort(st);
        String first=st[0];
        String last=st[st.length-1];
        int min=Math.min(first.length(),last.length());
        int i=0;
        while(i<min && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);

    }
}