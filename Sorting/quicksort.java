package Sorting;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        quicksorts(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksorts(int[] arr, int low, int high) {
        if (low < high) {
            int pi = parti(arr, low, high);
            quicksorts(arr, low, pi - 1);
            quicksorts(arr, pi + 1, high); // ✅ Fixed typo here
        }
    }

    static int parti(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}