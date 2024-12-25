package HashMap;
import java.util.*;
import java.io.*;
public class first_non_repeating_char {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String str = sc.nextLine();
    HashMap<Character,Integer>map = new HashMap<>();
    int n=str.length();
//construction of a hashtable
//key-> unique characters in the string
//value->count of each character in the string

for(int i=0;i<n;i++){
    if(map.containsKey(str.charAt(i))){
        map.put(str.charAt(i),map.get(str.charAt(i))+1);   
    }
    else{
        map.put(str.charAt(i),1);
    }
}


//Scan the entire hashtable and get the index of the non repeating character
int result = -1;
//get function returns value
for(int i=0;i<n;i++){
    if(map.get(str.charAt(i))==1){
        System.out.println("First non repeating character index  is : "+i);
        result=1;
        break;
    }
}

if(result==-1){
    System.out.println("No non repeating character present in the string");
}

    }
}
