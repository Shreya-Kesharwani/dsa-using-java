//Approach 1 : Brute force Approach
//Calculate a^b
//Time complexity:O(b)

/* 
package Recursion;
import java.util.*;
import java.io.*;


public class powerofelement {
    public static int  powerOfElement(int a, int b){
        int result=1;
        if(b==1){
            return a;
        }
        else{
           result =  a * powerOfElement(a, b-1);
        }
        return result;
        
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b : ");
    int b = sc.nextInt();
    int result = powerOfElement(a,b);
    System.out.println(a+" ^ "+b+" = "+result);
    }
}

*/


//Approach 2 : Divide and conquer
//Time Complexity:O(logb)
package Recursion;
import java.util.*;
import java.io.*;

public class powerofelement {
    public static long  powerOfElement(int a, int b){
        int mid=0;
        long result=0;
        long finalresult=0;

        //base case condition
        if(b==1){
            return a;
        }
        else{
            mid = b/2;
           result =  powerOfElement(a,mid);
           finalresult=(long)result*result;

           if(b%2==0){
            return finalresult;
        }
        else{
            return a*finalresult;
        }
        }
      
       
       
        
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a : ");
    int a = sc.nextInt();
    System.out.println("Enter the value of b : ");
    int b = sc.nextInt();
    long result = powerOfElement(a,b);
    System.out.println(a+" ^ "+b+" = "+result);
    }
}
