package Recursion;
import java.util.*;
import java.io.*;

public class fib {
    //function definition
    public static int fib(int n)
    {
        int result=0;
        //1. Base case condition
        if(n==0 || n==1){
            return n;
        }
        //2. Recursive function call
        else{
result = fib(n-1)+fib(n-2);
        }
        return result;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int result = fib(n);
    System.out.println("Fibonacii of given number is : "+result);
    }
}
