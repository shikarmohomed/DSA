class node<T> {
    T data;
    node<T> next;
    
    node(T d) {
        data = d;
        next = null;
    }
}
class SinglyLLADT<T> {
    node<T> head;

    public SinglyLLADT()
    {
        this.head = null;
    }

    public void insertAtbegining(T data)
    {
        node<T> newNode = new node<>(data);
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
        node<T> newNode = new node<>(data);
        if(head == null)
            {
                head = newNode;
            } 
        else{
            node<T> current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
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
    }

    public void deleteKey(T key)
    {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.data == key)
        {
            deleteAtbegining();
            return;
        }
        node<T> current = head;
        while(current.next != null){
            if(current.next.data == key)
            {
                current.next =current.next.next;
                return;
            }
            current = current.next;
        } 
        System.out.println("Key not found");

    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        node<T> current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LLdeleteKey {
    public static void main(String[] args) {
        SinglyLLADT<Integer> list = new SinglyLLADT<>();
        list.insertAtbegining(10);
        list.insertAtbegining(20);
        list.insertAtend(30);
        list.insertAtend(40);
        list.display();
         list.deleteKey(20);
        list.display();
        list.deleteKey(50); // Key not found
        list.display();

         SinglyLLADT<String> list1 = new SinglyLLADT<>();
        list1.insertAtbegining("Shikar");
        list1.insertAtbegining("Arkam");
        list1.insertAtend("Aslif");
        list1.insertAtend("Muzaraf");
        list1.display();
         list1.deleteKey("Arkam");
        list1.display();
        list1.deleteKey("John"); // Key not found
        list1.display();
    }
}
