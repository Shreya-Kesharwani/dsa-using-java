package Array;

import java.util.*;
import java.io.*;

public class binary_search {

    public static int binarysearch(int[] arr, int x) {

        int low = 0;

        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;

            }

            else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of element from the user
        System.out.println("Enter the number of elements present in an array");
        int n = sc.nextInt();

        // array elements entered from the user
        System.out.println("Enter the array elements");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // target element from the user
        System.out.println("Enter target element");
        int x = sc.nextInt();

        // Implementation of linear search
        int result = binarysearch(arr, x);
        if (result == 0) {
            System.out.println("Searched element is not found");
        } else {
            System.out.println("Searched element is found at index : " + result);
        }

    }
}
