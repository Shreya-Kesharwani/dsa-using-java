package Array.Assignments;

import java.util.Scanner;

public class max_element {
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
int max=0;
int sec_max=0;
for(int i=0;i<n;i++){
if(max<arr[i]){
    sec_max=max;
    max=arr[i];
}
else if(arr[i]>sec_max && arr[i]!=max)
{
    sec_max=arr[i];
}
}
System.out.println(sec_max);
    }
}
