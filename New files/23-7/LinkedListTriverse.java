public class LinkedListTriverse {
    class Node{
        int data ;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next= null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head== null)
        {
            head= newNode;
            tail= newNode;
        }
        else{
            tail.next= newNode;
            tail= newNode;
        }
    }

    public void display()
    {
        Node current = head;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("The nodes of link list :- ");
        while(current!=null)
        {
            System.out.print(current.data +" ");
            current= current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListTriverse itm= new LinkedListTriverse();
        itm.addNode(1);
        itm.addNode(2);
        itm.addNode(3);
        itm.display();
        
    }
}
