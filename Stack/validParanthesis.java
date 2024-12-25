//time complexity : O(n)
package Stack;
import java.util.*;

public class validParanthesis {

    public static boolean isValid(String str){
char[] chars=str.toCharArray();

Stack<Character> stack1 = new Stack<>();

for(char ele:chars){
    //if the element conyains open bracket, push it to the stack
    if(ele=='(' || ele=='[' ||ele=='{'){
        stack1.push(ele);
        continue;
    }
    // else if string="]})" return false
    else if(stack1.empty()){
        return false;
    }

    char top=stack1.pop();
  if(top=='(' && ele!=')'){
        return false;
    }

    else if(top=='[' && ele!=']'){
        return false;
    }

    else if(top=='{' && ele!='}'){
        return false;
    }
}

return(stack1.empty()==true);


    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String str = sc.nextLine();

    System.out.println("Is the given string is valid?"+isValid(str));
    }
}

/********************  My Logic *************/
/*
  class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
if(ch=='[' || ch=='('|| ch=='{'){
    stack1.push(ch);
}

 if (ch == ')' || ch == ']' || ch == '}') {
                if (stack1.isEmpty()) {
                    return false;
                }
 
 }

if(ch==')'){
    if(stack1.peek()=='('){
        stack1.pop();
    }
    else{
        return false;
    }
}


if(ch==']'){
    if(stack1.peek()=='['){
        stack1.pop();
    }
     else{
        return false;
    }
}

if(ch=='}'){
    if(stack1.peek()=='{'){
        stack1.pop();
    }
     else{
        return false;
    }
}
        }

        if(stack1.isEmpty()){
            return true;
        }
        return false;


    }
}
 */