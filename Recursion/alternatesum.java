package Recursion;

import java.util.*;
import java.io.*;

public class alternatesum {

    public static int alternateSumFind(int n) {
        // 1. base case condition
        if (n == 0) {
            return 0;
        }

        // 2. Recursive code
        // n is even
        if (n % 2 == 0) {
            return alternateSumFind(n - 1) - n;
        }
        // n is odd
        else {
            return alternateSumFind(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = alternateSumFind(n);
        System.out.println("Alternate sum series is : " + result);
    }
}
