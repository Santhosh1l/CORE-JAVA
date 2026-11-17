package String_Problems;

import java.util.*;

public class isomorphic {
    public static void main(String[] args) {
        String s1 = "add";
        String s2 = "egg";
      ans c= new ans();
        System.out.println( c.isIsomorphic(s1,s2));
    }
}
class ans{
public  boolean isIsomorphic(String s1, String s2) {
    Map<Character, Character> m1 = new HashMap<>();
    for(int i=0;i<s1.length();i++){
         char orginal=s1.charAt(i);
         char replacement=s2.charAt(i);
         if(!m1.containsKey(orginal)){
             if(!m1.containsValue(replacement)){
                 m1.put(orginal,replacement);
             }
             else{
                 return false;
             }
         }
         else{
             char mapped=m1.get(orginal);
             if(mapped!=replacement){
                 return false;
             }
         }
    }

    return true;
}}