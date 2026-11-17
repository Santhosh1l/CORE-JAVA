import java.util.Scanner;

public class Without_Arithmenti {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(isdivisble15(n)){
            System.out.println("yes");
        }
    }

    static boolean isdivisble15(int n){
        return isdivisble5(n) && isdivisble3(n);
    }

     static boolean isdivisble3(int n) {

        if (n==0) return  true;
        if (n==1) return false;
        int odd=0;
        int even=0;
        while(n>0){
            if((n&1)!=0){
                odd++;}
                n>>=1;

            if((n&1)!=0){
                even++;}
            n>>=1;
        }
        return isdivisble3(n);
    }


    static  boolean isdivisble5(int n){
        String s=Integer.toString(n);
        int nu=Integer.parseInt(Character.toString(s.charAt(s.length()-1)));
        return nu==0 || nu==5;

    }
}
