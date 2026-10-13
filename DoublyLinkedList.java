class Node<T>{
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(T data)
    {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLLADT<T>
{
    Node<T> head;

    public DoublyLLADT(T data)
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
            head.prev = newNode;
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
            newNode.prev = current;
        }
    }

     public void insertAtindex(T data , int index)
    {
        if(index < 0  || index>getSize())
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
            for(int i=0; i< index; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
        }
    }

    public void deleteAtbegining()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteAtend()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node<T> current = head;
        while(current.next != null)
        {
            current = current.next;
        }
        current.prev.next = null;
    }

    public void deleteKey(T key)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.data == key)
        {
            deleteAtbegining();
            return;
        }
        else{
            Node<T> current = head;
            while(current.next != null)
            {
                if(current.data == key)
                {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    return;
                }
                current = current.next;
            }
            System.out.println("Key not found");
        }
    }
    
    public int getSize()
    {
        int count = 0;
        Node<T> current =  head;
        while(current != null)
        {
            count++;
            current = current.next;
        }
        return count;
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else{
            Node<T> current = head;
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next; 
            }
            System.out.println( );
        }
    }

    public void reverse()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else{
            Node<T> current = head;
            Node<T> temp = null;
            while(current != null)
            {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
            }
            if(temp !=null)
                {
                    head = temp.prev;
                }
        }
        }
    }



public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLLADT<Integer> dll = new DoublyLLADT<>(5);
        dll.insertAtbegining(10);
        dll.insertAtbegining(20);
        dll.insertAtend(30);
        dll.insertAtend(15);
        dll.display();
        dll.reverse();
        dll.display();

        dll.deleteKey(15);
        dll.display();
    }
}
