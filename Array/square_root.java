package Array;

//Approach:Modified binary
//Time Complexity :O(log n)
//Space Complexity: O(1)
import java.util.*;
import java.io.*;

public class square_root {

    public static int findSquareRoot(int num) {
        int low = 0, high = num, result = -1;
        // modified binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = mid * mid;

            if (val == num) {
                // perfect square root
                return mid;
            } else if (val > num) {
                high = mid - 1;
            } else {
                // store the floor value , incase the number is not perfect square,we can print
                // the floor value
                result = mid;
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find square root");
        int num = sc.nextInt();

        // function calling
        int result = findSquareRoot(num);
        System.out.println("Square root of given number is : " + result);
    }
}
