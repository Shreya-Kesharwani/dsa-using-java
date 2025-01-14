//implementation of queue data structure using stack
//time complexity of enQueue : O(1);
//time complexity of deQueue : O(n);
package Queue;

import java.util.*;

public class queueusingStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    //insertion of the data in the queue
    //time complexity : O(1)
    static void enQueue(int data)
    {
       stack1.push(data);
    }

    //deletion ofthe data from the queue - FIFO
    static int deQueue(){
        int ele;
        if(stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        //Push all the elements from stack1 to stack2
        //time complexity : O(n)
        if(stack2.empty()){
            while(!stack1.empty()){
                ele=stack1.pop();
                stack2.push(ele);
            }
        }
        //pop the top element from stack2
        //FIFO
        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args){
    queueusingStack q = new queueusingStack();
    //fuction calling for insertion in the queue
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);

    //function calling for deletion of an element from the queue
    System.out.println(q.deQueue());
  // System.out.println( q.deQueue());
    }
}
