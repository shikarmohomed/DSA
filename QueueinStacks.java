class Stack{
    int maxSize;
    int[] stackArray;
    int top;

    public Stack(int maxSize)
    {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int data)
    {
        if(top == maxSize-1)
        {
            System.out.println("Stack is full");
        }
        else{
            stackArray[++top] = data;
        }
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stackArray[top--];
        }
    }
    
    public int peek()
    {
         if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stackArray[top];
        }
    }
}


public class QueueinStacks {
    private Stack stack1;
    private Stack stack2;

    public QueueinStacks(int maxSize)
    {
        stack1 = new Stack(maxSize);
        stack2 = new Stack(maxSize);
    }

    public void enQueue(int data)
    {
        if(stack1.top == stack1.maxSize-1  &&  stack2.top == stack2.maxSize-1)
        {
            System.out.println("Queue is full");
        }
        else{
            stack1.push(data);
        }
    }

}
