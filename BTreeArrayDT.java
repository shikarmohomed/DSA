class BTreeADT{
    int[] treeArray;
    int maxSize;
    int currentSize;

    public BTreeADT(int maxSize)
    {
        this.maxSize = maxSize;
        this.treeArray = new int[maxSize];
        this.currentSize = 0;
    }

    public void insert(int data)
    {
        if(currentSize == maxSize)
        {
            System.out.println("Tree is full");
            return;
        }
        treeArray[currentSize] = data;
        currentSize++;
    }

    public int search(int data)
    {
        if(currentSize == 0)
        {
            System.out.println("Tree is empty");
            return -1;
        }
        else{
            for(int i=0; i<currentSize; i++)
            {
                if(treeArray[i] == data)
                {
                    return i;
                }
            }
            return -1;
        }
    }
    
    public boolean delete(int data)
    {
        int index = search(data);
        if(index == -1)
        {
            System.out.println("Element not found");
            return false;
        }
        else{
           treeArray[index] = treeArray[currentSize-1];
           treeArray[currentSize-1] = 0;
           currentSize--;
           System.out.println("Element deleted");
           return true;
        }
    }

    public void inOrder(int index)
    {
        if(currentSize == 0)
        {
            System.out.println("Tree is empty");
            return;
        }
        else{
            if(index<0 || index>=currentSize)
            {
                System.out.println("Invalid index");
                return;
            }
            else if(treeArray[index] == 0)
            {
                return;
            }
            else{
                inOrder(2*index+1);
                System.out.print(treeArray[index] + " ");
                inOrder(2*index+2);
            }
        }
    }

    public void preOrder(int index)
    {
        if(currentSize == 0)
        {
            System.out.println("Tree is empty");
            return;
        }
        else{
            if(index<0 || index>=currentSize)
            {
                System.out.println("Invalid index");
                return;
            }
            else if(treeArray[index] == 0)
            {
                return;
            }
            else{
                System.out.print(treeArray[index] + " ");
                preOrder(2*index+1);
                preOrder(2*index+2);
            }
        }
    }

    public void postOrder(int index)
    {
        if(currentSize == 0)
        {
            System.out.println("tree is empty");
            return;
        }
        else{
            if(index<0 || index>=currentSize)
            {
                System.out.println("Invalid index");
                return;
            }
            else if(treeArray[index] == 0)
            {
                return;
            }
            else{
                postOrder(2*index+1);
                postOrder(2*index+2);
                System.out.println(treeArray[index] + " ");
            
            }
        }
    }

    public void levelOrder()
    {
        if(currentSize== 0)
        {
            System.out.println("Tree is empty");
        }
        else{
            for(int i=0; i<maxSize; i++)
            {
                if(treeArray[i] !=0)
                {
                    System.out.println(treeArray[i] + "");
                }
                else{
                    System.out.println("-");
                }
            }
        }

}
public class BTreeArrayDT {
    public static void main(String[] args) {
        BTreeADT bst = new BTreeADT(10);
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        int index = bst.search(4);
        if(index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
