package cognizant;

import java.util.*;
public class sort{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        merge(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int arr[], int low, int high){
        if(low>=high){
            return;}
        int mid=(low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        mergeit(arr,low,mid,high);
    }

    static void mergeit(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> arr1= new ArrayList<>();

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

        for(int i=low;i<=high;i++){
            arr[i]=arr1.get(i-low);
        }


    }
}