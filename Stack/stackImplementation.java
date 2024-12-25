package Stack;
import java.util.*;

public class stackImplementation {
    public static void main(String[] args){
    Stack<Integer> stack1=new Stack<>();

    //push the elements inside the stack
    stack1.push(2);
    stack1.push(4);
    stack1.push(6);
    stack1.push(9);

    //print the topmost element in the stack
    System.out.println("The topmost element in the stack before deletion is : "+stack1.peek());

    //delete the top element from the stack
    stack1.pop();
      //print the topmost element in the stack
      System.out.println("The topmost element in the stack after deletion  is : "+stack1.peek());

      //search an element in the stack
      //search function returns -1 when the element is not present in the stack.
      System.out.println("Element 4 is present at the position : "+stack1.search(2));

      //Check whether the stack is empty or not
      //empty function returns the boolean value(true/false)
      System.out.println("Is stack empty or not: "+stack1.empty());
    }
}
