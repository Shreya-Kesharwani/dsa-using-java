package Array.Assignments;

import java.util.*;
import java.io.*;

public class array_traversal {
    public static void main(String[] args){
     System.out.println("Enter size of array");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int arr[] = new int[n];
System.out.println("Enter elements of an array");
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}

for(int num:arr){
    if(num%2==0)
    {
        System.out.print(num+" ");
    }
}
    }
}
