package Array;

public class reverse {

    //Time complexity:O(n)
    //Space Complexity:O(1)
 public static void main(String[] args){
 int arr[]={1,3,5,8,10};
 int n=arr.length;

 for(int i=0;i<n/2;i++)
 {
    //swap the elements between arr[i] and arr[n-i-1]
    int temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
 }

 System.out.println("Reversed array is : ");
 for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
 }
 }
    
}
