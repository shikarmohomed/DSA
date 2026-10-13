

class Node{
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BSTreeLLADT {
    Node root;

    public BSTreeLLADT()
    {
        this.root = null;
    }

    public Node insert(Node cNode , int data)
    {
        if(cNode == null)
        {
            cNode = new Node(data);
            return cNode;
        }
        if(data < cNode.data)
        {
            cNode.left = insert(cNode.left , data);
        }
        else if(data > cNode.data)
        {
            cNode.right = insert(cNode.right , data);
        }
        return cNode;
    }

    public Node search(Node cNode , int data)
    {
        if(cNode == null || cNode.data == data)
        {
            return cNode;
        }
        if(data < cNode.data)
        {
            return search(cNode.left , data);
        }
        else{
            return search(cNode.right , data);
        }
    }

    public void inOrder(Node cNode)
    {
        if(cNode != null)
        {
            inOrder(cNode.left);
            System.out.print(cNode.data + " ");
            inOrder(cNode.right);
        }
    }

    public void preOrder(Node cNode)
    {
        if(cNode != null)
        {
            System.out.print(cNode.data + " ");
            preOrder(cNode.left);
            preOrder(cNode.right);
        }
    }

    public void postOrder(Node cNode)
    {
        if(cNode != null)
        {
            postOrder(cNode.left);
            postOrder(cNode.right);
            System.out.print(cNode.data + " ");
        }
    }

    public Node delete(Node cNode , int data)
    {
        if(cNode == null)
        {
            return cNode;
        }
        if(data < cNode.data)
        {
            cNode.left = delete(cNode.left , data);
        }
        else if(data > cNode.data)
        {
            cNode.right = delete(cNode.right , data);
        }
        else{
            if(cNode.left == null && cNode.right == null)
            {
                return cNode;
            }
            else if(cNode.left == null)
            {
                return cNode.right;
            }
            else if(cNode.right == null)
            {
                return cNode.left;
            }
            else{
                int minValue = minValue(cNode.right);
                cNode.data = minValue;
                cNode.right = delete(cNode.right , minValue);
            }
        }
        return cNode;
    }

    private int minValue(Node cNode)
    {
        int minValue = cNode.data;
        while(cNode.left != null)
        {
            minValue = cNode.left.data;
            cNode = cNode.left;
        }
        return minValue;
    }

    public void findMin(Node cNode)
    {
        if(cNode == null)
        {
            System.out.println("Tree is empty");
            return;
        }
        while(cNode.left !=null)
        {
            cNode = cNode.left;
        }
        System.out.println("Minimum value in the tree is: " + cNode.data);
    }

    public void findMax(Node cNode)
    {
        if(cNode == null)
        {
            System.out.println("Tree is empty");
            return;
        }
        while(cNode.right !=null)
        {
            cNode = cNode.right;
        }
        System.out.println("Maximum value in the tree is: " + cNode.data);
    }

    public static void main(String [] args)
    {
        BSTreeLLADT bst = new BSTreeLLADT();
        bst.root =bst.insert(bst.root,50);
        bst.root = bst.insert(bst.root,30);
        bst.root = bst.insert(bst.root,70);
        bst.root = bst.insert(bst.root,20);
        bst.root = bst.insert(bst.root,40);
        bst.root = bst.insert(bst.root,60);
        bst.root = bst.insert(bst.root,80);     
        
        bst.search(null, 40);
        bst.search(null, 90);
        System.out.println("Inorder traversal of the given tree");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.println("Preorder traversal of the given tree");
        bst.preOrder(bst.root); 
        System.out.println();

        System.out.println("Postorder traversal of the given tree");
        bst.postOrder(bst.root);    
        System.out.println();    

        System.out.println("inorder traversal from given node");
        bst.inOrder(bst.search(bst.root, 30));
        System.out.println();

        bst.delete(bst.root,70);
        System.out.println("Inorder traversal after deleting 70");
        bst.inOrder(bst.root);
    }
}
