class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackADT
{
    Node top;

    public StackADT()
    {
        this.top = null;
    }

    public void push(int data)
    {
        Node newNode = new Node(data);
        if(top == null)
        {
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    public int peek()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return top.data;
        }
    }

    public void display()
    {
        if(top == null)
        {
            System.out.println("Stack is empty");
            return;
        }
        else{
            Node current = top;
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class StackADTLL {
    public static void main(String[] args) {
        StackADT stack = new StackADT();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: 30 20 10
        System.out.println("Top element is: " + stack.peek()); // Output: Top element is: 30
        System.out.println("Popped element is: " + stack.pop()); // Output: Popped element is: 30
        stack.display(); // Output: 20 10
    }
}
