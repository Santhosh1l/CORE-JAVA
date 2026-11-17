package String_Problems;
import java.util.*;
public class remove_duplicate_character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ans(s));
    }
    static String ans(String s){
        Set<Character> set=new HashSet<>();
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                res.append(c);
            }
        }
        return res.toString();
    }
}
