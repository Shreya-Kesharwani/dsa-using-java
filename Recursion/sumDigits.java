// Approach : Recursion

package Recursion;

import java.util.*;
import java.io.*;

public class sumDigits {

    public static int sumOfDigits(int n) {
        // 1. Base case condition
        if (n == 0) {
            return 0;
        } else {
            // 2. Recursive function call
            return (n % 10) + sumOfDigits(n / 10);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which you want to calculate the sum of all digits");
        int n = sc.nextInt();
        int result = sumOfDigits(n);
        System.out.println("Sum of all digits of " + n + "is : " + result);
    }
}
