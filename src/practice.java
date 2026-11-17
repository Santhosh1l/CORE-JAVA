package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,56,4,90};
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public  static  void merge(int arr[],int low,int high){
        if(low>= high){
            return;
        }
        int mid=low+(high-low)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        mergeit(arr,low,mid,high);
    }
    static void mergeit(int []arr,int low,int mid,int high){
        ArrayList<Integer>res= new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high ){
            if(arr[left]<arr[right]){
                res.add(arr[left++]);
            }
            else{
                res.add(arr[right++]);
            }
        }
        while(left<=mid){
            res.add(arr[left++]);
        }
        while (right<=high){
            res.add(arr[right++]);
        }

        for(int i=low;i<=high;i++){
            arr[i]=res.get(i-low);
        }

    }

}


