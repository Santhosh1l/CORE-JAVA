package cognizant;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int d[]=doublearray(arr,n);
        System.out.println(Arrays.toString(d));
    }
    static int[] doublearray(int arr[] ,int n){
        int doublea[]= new int[n*2];
        for(int i=0;i<n;i++) {
            doublea[i] = arr[i];

        }
        for(int i=n;i< doublea.length;i++){
            doublea[i]=arr[i-n];
        }

        return doublea;
    }
}
