class Node
{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class CircularLLADT
{
    Node head;

    public CircularLLADT(){
        this.head = null;
    }

    public void insertAtbegining(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
           newNode.next = newNode;
           head = newNode;
           
        }
        else{
           Node current = head;
           while(current.next != head)
           {
               current = current.next;
           }
           current.next = newNode;
           newNode.next = head;
           head = newNode;
        }
    }

    public void insertAtend(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            newNode.next = newNode;
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != head)
            {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void deleteAtbegining()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==head)
        {
            head =null;
        }
        else{
            Node current = head;
            while(current.next != head)
            {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        }
    }

    public void deleteAtend()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==head)
        {
            head =null;
        }
        else{
            Node current = head;
            Node prev = null;
            while(current.next != head)
            {
                prev = current;
                current = current.next;
            }
            prev.next = head;
        }
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do{
            System.out.print(current.data + " ");
            current = current.next;
        }while(current != head);
        System.out.println();
    }
}


public class CircularLinkedList
{
    public static void main(String [] args)
    {
        CircularLLADT CLL1 = new CircularLLADT();
        CLL1.insertAtbegining(20);
        CLL1.insertAtend(30);
        CLL1.display();
    }
}