package Linked_List;

public class demo {
Node head;
class Node{
    int data;
    Node next;

    Node(int newdata){
        data=newdata;
        next=null;
    }
}

void in_at_begin(int newdata){
    Node newnode = new Node(newdata);
    newnode.next=head;
    head=newnode;
}


void in_at_end(int newdata){
    Node newnode = new Node(newdata);
   if(head==null){
    head = new Node(newdata);
    return;
   }

   Node temp=head;
   while(temp.next!=null){
    temp=temp.next;
   }
   temp.next=newnode;
   return;
}

void in_after(Node prev,int newdata){
    Node newnode = new Node(newdata);
   if(head==null){
    System.out.println("The previous node cannot contain null values");
    return;
   }

   newnode.next=prev.next;
   prev.next=newnode;
   return;

 
}

void display(){
    Node temp = head;
    while(temp!=null){
        if(temp.next==null){
            System.out.print(temp.data);
            break;
        }
        System.out.print(temp.data+"->");
        
        temp=temp.next;
    }

}

    public static void main(String[] args){
demo ll = new demo();
System.out.println("  Insertion at beginning");
ll.in_at_begin(1);
ll.in_at_begin(100);
ll.in_at_begin(200);
ll.display();

System.out.println("  Insertion after certain node ");
ll.in_after(ll.head.next,2);
ll.in_after(ll.head.next,3);
ll.display();


System.out.println("  Insertion at end");
ll.in_at_end(4);
ll.in_at_end(5);
ll.in_at_end(6);
ll.display();
    }
}
