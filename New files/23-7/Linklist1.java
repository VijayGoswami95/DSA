// We use Linked list because it reduce the time complexity and it does not require continous memory allocation.

class LinkedList{
    Node head;

    static class Node{
        int data;
        Node next;

        // Constructor 
        Node(int d){
            data = d;
        }
    }
    public void push(int new_data)
    {
        Node n = new Node(new_data);
        n.next= head;
        head = new_node;
    }
}

// tail.next = new_node;
// new_node = null;

