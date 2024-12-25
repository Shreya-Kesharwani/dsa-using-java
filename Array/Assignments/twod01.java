package Array.Assignments;
import java.util.*;
import java.io.*;
public class twod01 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int m = sc.nextInt();
    int n= sc.nextInt();
    int arr[][] = new int[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }

    int p=0,negative=0,o=0,e=0,z=0;
for(int i=0;i<m;i++)
{
    for(int j=0;j<n;j++)
    {
        if(arr[i][j]<0){
            negative++;
        }

        if(arr[i][j]>0){
            p++;
        }

        if(arr[i][j]==0){
            z++;
        }

        if(arr[i][j]%2==0){
            e++;
        }
        if(arr[i][j]%2!=0){
            o++;
        }
    }
}

System.out.println("Number of positive numbers = "+p);

System.out.println("Number of negative numbers = "+negative);

System.out.println("Number of odd numbers = "+o);

System.out.println("Number of even numbers = "+e);

System.out.println("Number of 0 = "+z);


    }
}
