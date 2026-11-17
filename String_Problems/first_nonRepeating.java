package String_Problems;

import java.util.*;
public class first_nonRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(rep(s));
    }
    static char rep(String s){
        HashMap<Character, Integer> fre=new HashMap<>();
        for(char c:s.toCharArray()){
            fre.put(c,fre.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(fre.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return 'n';
    }
}
