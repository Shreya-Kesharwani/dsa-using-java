
package Array;
import java.util.*;

public class check_palindrome {

public static void main(String[] args){

int n;
System.out.println("Enter the size of an array");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int count=0;
int []arr=new int[n];

System.out.println("Enter elements of an array");
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}

for(int i=0;i<n/2;i++){
    if(arr[i]!=arr[n-i-1]){
        System.out.println("Array is not palindrome");
        count=1;
        break;
    }
}
if(count==0){
    System.out.println("Array is palindrome");
}


}
}


//Approach 2

/* 
package Array;
import java.util.*;

public class check_palindrome {

public static void main(String[] args){

int n;
boolean ispalindrome=true;
System.out.println("Enter the size of an array");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int count=0;
int []arr1=new int[n];
int []arr2=new int[n];

System.out.println("Enter elements of an array");
for(int i=0;i<n;i++)
{
    arr1[i]=sc.nextInt();
}

for(int i=0;i<n;i++){
    arr2[i]=arr1[n-i-1];
    
}



for(int i=0;i<n;i++){
   if(arr1[i]!=arr2[i]){
    ispalindrome=false;
   }
 }

 if(ispalindrome==true){
    System.out.println("Array is palindrome");
 }
 else{
    System.out.println("Array is not palindrome");
 }
}
}
*/



