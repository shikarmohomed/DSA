public class QueueADTArray {
    int[] queueArray;
    int front,rear;
    int maxSize;

    public QueueADTArray(int maxSize)
    {
        this.queueArray = new int [maxSize];
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = -1; 
    }

    public void enQueue(int data)
    {
        if(rear == maxSize-1)
        {
            System.out.println("the array is full");
        }
        else{
            queueArray[++rear] = data;
        }
    }

    public int deQueue()
    {
        if(rear == -1 || front>rear)
        {
            System.out.println("Array is empty");
            return -1;
        }
        else{
            return queueArray[front++];
        }
    }

    public int peek()
    {
         if(rear == -1)
        {
            System.out.println("Array is empty");
            return -1;
        }
        else{
            return queueArray[front];
        }
    }

    public void display()
    {
        if(rear == -1)
        {
            System.out.println("Array is empty");
        }
        else{
            for(int i = front; i<=rear; i++)
            {
                System.out.println(queueArray[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueADTArray L1 = new QueueADTArray(30);
        L1.enQueue(14);
        L1.enQueue(10);
        L1.enQueue(32);
        L1.display();
    }
}
