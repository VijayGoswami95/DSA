public class SinglyLinkedList{
        // Represent a node of the singly list
        class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        // Represent the head and tail of the singly linked list
        public Node head = null;
        public Node tail = null;

        // addNode() will add a new node to the list 
        public void addNode(int data){
            // Create a new node
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                tail=newNode;
            }
            else{
                tail.next = newNode;
                tail= newNode;
            }
        }
        public void display(){
            Node current = head;
            if(head== null)
            {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Node of Singly linked list : ");
            while(current!=null)
            {
                System.out.print(current.data + " ");
                current= current.next;
            }
            System.out.println();
        }
    
    public static void main(String args[])
    {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.display();
    }
}