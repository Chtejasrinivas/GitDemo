class Queue
{
    int rear;
    int front;
    long[] queueArray;
    int maxSize;
    int currentSize;

    public Queue(int size)
    {
        this.maxSize = size;
        queueArray = new long[maxSize];
        front=0;
        rear=-1;
        currentSize=0;
    }

    //Enqueue Operation 

    public void enqueue(long data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(rear==maxSize-1) rear=-1;

            queueArray[++rear] = data;
            currentSize++;
    }
    public long dequeue(){
        if(isEmpty())
        {
            throw new RuntimeException("Queue is Empty");
        }
        long item = queueArray[front++];
        if(front==maxSize) front=0;
        currentSize--;
        return item;
    }
    public long front(){
        return queueArray[front];
    }
    public long rear(){
        return queueArray[rear];
    }
    public boolean isFull()
    {
        return (currentSize==maxSize);
    }
    public boolean isEmpty()
    {
        return (currentSize==0);
    }

    public static void main(String[] args)
    {
        Queue myq= new Queue(5);
        myq.enqueue(10);
        System.out.println(myq.dequeue());
        System.out.println(myq.isEmpty());
        System.out.println(myq.isFull());
    }
}
