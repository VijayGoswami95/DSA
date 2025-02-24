public class JavaTrees {
    

    int countNodes(Node root)
    {
        if(root ==null)
        {
            return 0;
        }
        int X = countNode(root-> left);
        int Y= countNodes(root-> right);
        return X+Y+1;
    }

    int sumOfNode(Node root)
    {
        if(root ==null)
        {
            return 0;
        }
        int X= sumOfNode(root-> left)
        int Y= sumOfNode(root-> right)
        // spyna
        return X+Y+root.data;
    }

    int height( Node root)
    {
        if (root == null)
        {
            return 0;
        }

        int X = height(root->left);
        int Y = height(root-> right);

        return
    }
    public static void main(String[] args) {
        /*        1  
         *       121
         *      12321
         *     1234321
         * 
         *        *
         *       ***
         *      *****
         *       ***
         *        * 
        */
    }
}
