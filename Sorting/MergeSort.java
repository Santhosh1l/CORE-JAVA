package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={98,88,88,13,66,1188};
        merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
public  static  void merge(int arr[], int low,int high){
        if(low>=high){
            return;
        }
        int mid= (low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        mergeit(arr,low,mid,high);
}

static  void mergeit(int arr[],int low, int mid, int high){
    ArrayList<Integer> arr1= new ArrayList<>();
    int left=low;
    int right=mid+1;
    while(left<=mid && right<=high){
        if(arr[left]<=arr[right]){
        arr1.add(arr[left++]);}
        else{
            arr1.add(arr[right++]);
        }
    }
    while(left<=mid){
        arr1.add(arr[left++]);
    }
    while(right<=high){
        arr1.add(arr[right++]);
    }
for(int i=low;i<high;i++){
    arr[i]=arr1.get(i-low);
}



}
}