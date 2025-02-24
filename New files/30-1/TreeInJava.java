class Node{
    int value;
    Node left;
    Node right;

    Node(int value)
    {
        this.value=value;
        left = null;
        right= null;
    }
}


public class TreeInJava {

    // private static Node node;
    Node root;

    private Node addNodes(Node current, int value)
    {
        if(current == null)
        {
            return new Node(value);
        }
        if(value< current.value)
        {
            current.left = addNodes(current.left, value);
        }
        else if(value> current.value)
        {
            current.right = addNodes(current.right, value);
        }
        else{
            return current;
        }
        return current;
    }


    public void addValue(int value)
    {
        root = addNodes(root, value);
    }

    public void traverseInOrder(Node node)
    {
        if(node!= null)
        {
            traverseInOrder(node.left);
            System.out.print(node.value +" ");
            traverseInOrder(node.right);
        }
    }
   public static void main(String[] args) {
    System.out.println("Hello Github");
    // Node node;
    
    TreeInJava obj = new TreeInJava();
    obj.addValue(43);
    obj.addValue(5);
    obj.addValue(3);
    obj.addValue(74);
    obj.addValue(69);
    obj.addValue(93);
    obj.addValue(12);
    obj.addValue(36);
    obj.addValue(42);
    // Node newNode=root;

    
    obj.traverseInOrder(node);
    System.out.println(node);
    // obj.traverseInOrder(newNode);
   } 
}