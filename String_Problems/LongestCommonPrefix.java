package String_Problems;
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]={ "flower","flow","flight"};
        System.out.println(ans(s));
    }
    static String ans(String strs[]){
        Arrays.sort(strs);
        String fi=strs[0];
        StringBuilder res=new StringBuilder();
        String las=strs[strs.length-1];
        int min=Math.min(fi.length(),las.length());
        int i=0;
        while(i<min && fi.charAt(i)==las.charAt(i)){
            i++;
        }
        return fi.substring(0,i);

    }
}
