package Recursion;
import java.util.*;
import java.io.*;

public class binarysearch {
    public static int binarys(int[] arr,int low,int high,int x)
    {
        int result=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
  if(arr[mid]==x){
    return mid;
  }
  else if(arr[mid] < x){
//traverse towards right side of an array
return binarys(arr, mid+1, high, x);
  }
  else{
    //traverse towards a left side of an array
    return binarys(arr, low, mid-1, x);
  }
        }
        return result;
    }

    public static void main(String[] args){
    int[] arr = {2,4,8,12,16,19,21,27,29,35};
    int low =0;
    int high = arr.length-1;
    int x=28;
    
    //function call
     int result = binarys(arr,low,high,x);
     System.out.println("The array element is at position "+result);


    }
}
