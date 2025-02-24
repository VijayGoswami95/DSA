public class LinkedListReveers1 {
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data= data;
            this.next= null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addData(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("The stack is empty.");
            return;
        }
        else
        {
            System.out.println("The nodes of Linked list :- ");
            Node strt = head;
            while(strt!=null)
            {
                System.out.println(strt.data);
                strt=strt.next;
            }
        }
    }

    public void reverse()
    {
        Node prev= null;
        Node first= head;
        Node second = first.next;

        if(head == null)
        {
            System.out.println("The Linked list is empty.");
            return;
        }
        while(second!=null)
        {
            first = prev;
            second = first;
            second =second.next;
            first =first.next;
        } 

    }

    public static void main(String[] args) {
        LinkedListReveers1 list1 = new LinkedListReveers1();
        list1.addData(1);
        list1.addData(2);
        list1.addData(3);
        list1.addData(4);
        list1.display();
        // list1.reverse();
        list1.display();
    }
}
