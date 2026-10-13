class Node<T>
{
    T data;
    Node<T> next;

    public Node(T data)
    {
        this.data = data;
        this.next = null;
    }
}
class SinglyLLADT<T>
{
    Node<T> head;

    public SinglyLLADT()
    {
        this.head = null;
    }

    public void insertAtbegining(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtend(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(head == null)
            {
                head = newNode;
            } 
        else{
            Node<T> current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }    
    }

    public void insertAtindex(T data , int index)
    {
        if(index < 0  || index>getsize()+1)
        {
            System.out.println("Invalid index");
            return;
        }
        if(index == 0)
        {
            insertAtbegining(data);
            return;
        }
        else{
            Node<T> newNode = new Node<>(data);
            Node<T> current = head;
            for(int i=0; i < index; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }    
    public void deleteAtbegining()
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
        }
        else{
            head = head.next;
        }
    }
    
    public void deleteAtend()
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
        }
        else{
            Node<T> current = head;
            Node<T> previous = null;
            while(current.next != null)
            {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }

    public void deleteAtindex(int index)
    {
        if(index<0 || index>getsize()+1)
        {
            System.out.println("invalid index");
        }
        if(index==0)
        {
            deleteAtbegining();
        }
        else{
            Node<T> current = head;
            for(int i=0; i<index; i++)
            {
                current= current.next;
            }
            current.next = current.next.next;
        }
    }

    public int getsize()
    {
        int count=0;
        Node<T> current = head;
        while(current.next!= null)
        {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display()
    {
        Node<T> current = head;
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println( );
    }
}

public class SinglyLinkedList
{
    public static void main(String [] args)
    {
        SinglyLLADT<Integer> LL1 = new SinglyLLADT<>();

        LL1.insertAtbegining(4);
        LL1.insertAtbegining(8);
        LL1.insertAtbegining(9);
        LL1.insertAtbegining(3);

        LL1.display();

        LL1.insertAtend(5);        
        LL1.display();

        LL1.insertAtindex(12,3);
        LL1.display();

        LL1.deleteAtbegining();
        LL1.deleteAtend();
        LL1.display();

        LL1.deleteAtindex(1);
          LL1.display();

     SinglyLLADT<String> LL2 = new SinglyLLADT<>();

        LL2.insertAtbegining("Shikar");
        LL2.insertAtbegining("Arkam");
        LL2.insertAtbegining("Aslif");
        LL2.insertAtbegining("Muzaraf");

        LL2.display();

        LL2.insertAtend("Rushda");        
        LL2.display();

        LL2.insertAtindex("Dulcy",3);
        LL2.insertAtindex("Sahama",5);
        LL2.display();

        LL2.deleteAtbegining();
        LL2.deleteAtend();
        LL2.display();

        LL2.deleteAtindex(1);
        LL2.display();
    }
}