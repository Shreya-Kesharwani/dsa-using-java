package Array.Assignments;

import java.util.Scanner;

public class peak_element {


    public static int peak(int[] arr)
    {
       int n=arr.length;
for(int i=1;i<n-1;i++){
if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
    return arr[i];
}
}
   return -1; }
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

System.out.println(peak(arr));
    }
}
