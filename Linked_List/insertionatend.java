package Linked_List;



public class insertionatend {
    Node head;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

//implementation of insertion of a node at the end
public void insertAtEnd(int newData){
    Node newNode = new Node(newData);

    //linkedlist is empty
    if(head == null){
        head = new Node(newData);
        return;
    }

    //linkedlist is not empty
newNode.next = null;
Node temp = head;

while(temp.next!=null)
{
    temp = temp.next;
}

temp.next = newNode;
return;
}

//implementation of displaying the linkedlist
public void displayLL(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
    public static void main(String[] args){
    insertionatend llist = new insertionatend();
    llist.insertAtEnd(2);
    llist.insertAtEnd(4);
    llist.insertAtEnd(8);

    System.out.println("Before insertion of 10");
    llist.displayLL();
    System.out.println();

    llist.insertAtEnd(10);
    System.out.println("After insertion of 10");
    llist.displayLL();
    System.out.println();

    }
}
