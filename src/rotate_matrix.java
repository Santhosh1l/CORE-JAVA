import java.util.Arrays;
import java.util.Scanner;

public class rotate_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        // change row to coloumn
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //rotate
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp= arr[i][j];
                arr[i][j]=arr[i][n-1-j];
                arr[i][n-j-1]=temp;

            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
/*

brute force
create new array
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
newarr[i][[n-i-j]=arr[i][j];
 */