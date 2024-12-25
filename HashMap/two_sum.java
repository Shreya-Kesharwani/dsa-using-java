package HashMap;
import java.util.*;
import java.io.*;
public class two_sum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();

    //input array elements
    int[] arr = new int[n];
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    //input target element
    System.out.println("Enter the target element");
    int target=sc.nextInt();

    //create a hashmap where key is arr[i] and value is i
    HashMap<Integer,Integer>map = new HashMap<>();
   for(int i=0;i<n;i++){
    map.put(arr[i],i);
   }
//create a result array to display the index of two numbers

int[] result = new int[2];
   //if current is equal to target
   for(int i=0;i<n;i++){
 
    if((arr[i]==target) && map.containsKey(0)){
        result[0]=i;
        result[1]=map.get(0);
        break;
    } 
    else if(map.containsKey(target-arr[i])){
        if(map.get(target-arr[i])>i){
result[0]=i;
result[1]=map.get(target-arr[i]);
break;
        }
    }
   }

   for(int i=0;i<2;i++){
    System.out.print("Indexes of given sum are : "+result[i]+" ");
   }

    }
}
