package Array.Assignments;
import java.util.*;

public class one_dimensional01 {
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

for(int i=0;i<n;i++){
    if(i%2==0){
        sum+=arr[i];
    }
}
System.out.println(sum);
    }
}
