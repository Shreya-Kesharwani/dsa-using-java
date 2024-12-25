package Array;
//time complexity: O(n)
//Space Complexity:O(1)
public class missingnumber {
    public static void main(String[] args){
    int arr[] = {1,2,4,7,6,5};
    int n=arr.length;

    //sum of natural numbers in an array-O(1)
    int sum_natural_number=(n+1)*(n+2)/2;
    int sum=0;

    //sum of current elemts present in an array-O(n)
for(int i=0;i<n;i++){
    sum+=arr[i];
}

int missing_elem=0;
missing_elem=sum_natural_number-sum;
System.out.println("Missing element in an array is : "+missing_elem);

}
}
