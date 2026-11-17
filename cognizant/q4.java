package cognizant;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x=sc.nextInt();
        int ball[]=new int[n];
        int cost[]=new int[n];
        for(int i=0;i<n;i++){
            ball[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            cost[i]= sc.nextInt();
        }
        System.out.println(ans(n,x,ball,cost));
    }
    static  int ans(int n, int x, int bal[],int cost[]){

        int max=0;
        for(int i=0;i<n-1;i++){

                if(cost[i]+cost[i+1]<=x && bal[i]+bal[i+1]> max){
                    max=bal[i]+bal[i+1];

            }
        }
        return max;
    }

}
