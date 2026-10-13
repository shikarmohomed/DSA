class node
{
    int data;
    node next;      
    public node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class SinglyLLADT
{
    node head;

    public SinglyLLADT()
    {
        this.head = null;
    }

    public void insertAtbegining(int data)
    {
        node newNode = new node(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtend(int data)
    {
        node newNode = new node(data);
        if(head == null)
            {
                head = newNode;
            } 
        else{
            node current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }    
    }

    public void insertAtindex(int data , int index)
    {
        if(index < 0  || index>getsize()+1)
        {
            System.out.println("Invalid index");
            return;
        }
        if(index == 0)
        {
            insertAtbegining(data);
        }
        else{
            node newNode = new node(data);
            node current = head;
            for(int i=0; i< index-1; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int getsize()
    {
        int size = 0;
        node current = head;
        while(current != null)
        {
            size++;
            current = current.next;
        }
        return size;
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        node current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        node prev = null;
        node current = head;
        node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

public class reverseLL
{
    public static void main(String[] args) 
    {
        SinglyLLADT list = new SinglyLLADT();
        list.insertAtend(1);
        list.insertAtend(2);
        list.insertAtend(3);
        list.insertAtend(4);
        list.insertAtend(5);
        System.out.println("Original List:");
        list.display();
        list.reverse();
        System.out.println("Reversed List:");
        list.display();
    }
}