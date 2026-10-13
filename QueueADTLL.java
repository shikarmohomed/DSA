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

public class QueueADTLL<T> {
    Node<T> front,rear;
    
    public QueueADTLL()
    {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(T data)
    {
        Node<T> newNode = new Node<>(data); 
        if(front == null)
        {
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T deQueue()
    {
        if(front == null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        else{
            T data = front.data;
            front = front.next;
            if(front == null)
            {
                rear = null;
            }
            return data;
        }
    }

    public void display()
    {
        if(front == null)
        {
            System.out.println("Queue is empty");
        }
        else{
            Node<T> current = front;
            while(current.next != null)
            {
                System.out.println(current.data + ",");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        QueueADTLL<Integer> Q1 = new QueueADTLL<>();
        Q1.enQueue(12);
        Q1.enQueue(54);
        Q1.enQueue(21);
        Q1.display();
    }

}
