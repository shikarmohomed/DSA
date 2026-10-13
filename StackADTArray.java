class StackADT<T>
{
    int maxSize;
    T[] stackArray;
    int top;

    public StackADT(int maxSize)
    {
        this.maxSize = maxSize;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }
    public void push(T data)
    {
        if(top == maxSize-1)
        {
            System.out.println("Stack is full");
            return;
        }
        else{
            stackArray[++top] = data;
        }
    }
    public T pop()
    {
        if(top ==-1)
        {
            System.out.println("Stack is empty");
            return null;
        }
        else{
            return stackArray[top--];
        }
    }

    public T peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return null;
        }
        else{
            return stackArray[top];
        }
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else{
            for(int i=top; i>=0; i--)
            {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

}


public class StackADTArray {
    public static void main(String [] args)
    {
        StackADT<Integer> stack = new StackADT<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped element: " + stack.pop());
        stack.display();
        System.out.println("Top element: " + stack.peek());
    }
}
