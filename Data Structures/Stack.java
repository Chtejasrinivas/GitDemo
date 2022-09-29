public class Stack {
    int maxSize;
    long[] stackArray;
    int top;

    Stack (int size) 
    {
        this.maxSize = size;
        stackArray=new long[maxSize];
        top=-1;
    }

    public void push(long data)
    {
        stackArray[++top] = data;
    }
    public long pop()
    {
        return stackArray[top--];
    }
    public long peek()
    {
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    
}
public static void main(String[] args) {
    Stack s = new Stack(5);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    // s.push(60);
    while(!s.isEmpty())
    {
        System.out.print(s.pop()+" ");
    }
}
}
