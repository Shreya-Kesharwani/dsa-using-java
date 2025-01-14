//Time Complexity : O(n^2)
//Space Complexity : O(1)

package Array.Sorting;
import java.util.*;
import java.io.*;

public class selectionsort {

    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //min_idx is taking the index of minimum element at every iteration

int min_idx = i;
for(int j=i;j<arr.length;j++)
{
    if(arr[j]<arr[min_idx])
   {
    min_idx = j;
   }
}
if(min_idx!=i)
{
    //swap b/w arr[min_idx] and arr[i]
    int temp = arr[min_idx];
    arr[min_idx]=arr[i];
    arr[i] = temp;
}

        }
    }
    public static void main(String[] args){
    int[] arr = {20,50,12,17,19,25,97,16};
    //function calling
    SelectionSort(arr);
    System.out.println("Sorted array is : ");
    System.out.println(Arrays.toString(arr));
    }
}
