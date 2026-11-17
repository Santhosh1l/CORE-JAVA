package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencybyMap { public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    ans(s);
}
    static void ans(String s){
        HashMap<Character,Integer> fre= new HashMap<>();
        for(char c:s.toCharArray()){
            fre.put(c,fre.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> c:fre.entrySet()) {
            System.out.println(c.getKey() + ":" + c.getValue());
        }
    }
}
