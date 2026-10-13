public class PriorityQueueADT {
    int maxSize;
    int[] queueArray;
    int front;
    int rear;

    public PriorityQueueADT(int maxSize)
    {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = -1;
        this.rear = -1; 
    }

    public void enQueue(int data)
    {
        if(rear == maxSize-1)
        {
            System.out.println("Queue is full");
        }
        else{
            int i = maxSize-1;
            while(i >=0 && queueArray[i]>data)
            {
                queueArray[i+1] = queueArray[i];
                i--;
            }
            queueArray[i+1] = data;
        }
    }
}
