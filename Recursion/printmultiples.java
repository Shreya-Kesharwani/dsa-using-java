package Recursion;

import java.util.*;
import java.io.*;

public class printmultiples {

    //function definition
    public static int printMultiples(int n, int k) {
        int result = 0;

        //1. Base case condition
        if (k == 1) {
            return n;
        } 
        
        //2. recursive function calls
        else {
           printMultiples(n, k - 1);
            result = n * k;
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int result = printMultiples(n, k);
        System.out.println("The result is : " + result);
    }
}
