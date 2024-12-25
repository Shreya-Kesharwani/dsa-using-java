package Queue;
import java.util.*;

public class stackusingqueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    //to add new element in the stack
    // time complexity : O(n)
    static void add(int data){
        //Move all the elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        //2. Push the new data to q1
        q1.add(data);

        //3. Move back all the elements from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            //poll method is also used to remove the element from the queue
            //returns null when the queue is empty
            q2.poll();
        }
    }

    //to delete the element from the stack
    //time complexity: O(1)
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Queue underflow");
            System.exit(0);
        }

        int ele = q1.peek();
        q1.poll();
        return ele;
    }
    public static void main(String[] args){
        stackusingqueue s = new stackusingqueue();
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(12);

        //pop all the elements from the stack
        System.out.println("Deleted element from the stack is : "+s.remove());

        System.out.println("Deleted element from the stack is : "+s.remove());
    }
}
