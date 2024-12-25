package Array;

import java.util.*;
import java.io.*;

public class first_occ {

    public static int findFirstOccurence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            // to avoid overflow
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of an array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int x = sc.nextInt();
        int result = findFirstOccurence(arr, x);
        if (result == -1) {
            System.out.println("Target element is not present in an array");
        } else {
            System.out.println("Target element first occurence is present at index : " + result);
        }

    }
}
