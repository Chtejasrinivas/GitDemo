class linkedList
{
    Node headPointer;
    Node tailPointer;
    int size;

    public linkedList()
    {
        this.size = 0;
    }

    class Node
    {
        // Generally a node has data part and next part
        int data;
        Node next;

        // If the data is given along with the node 
        public Node(int data)
        {
            this.data=data;
        }
        public Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }
    }
    // Insertion of elements into the linked list
    // 1. Insert at Beginning
    public void insertAtBeginning(int data)
    {
        // If no element is present in the list then headPointer is NULL
        // We should make the newly created as head node
        if(headPointer == null)
        {
            Node newNode = new Node(data);
            headPointer = newNode;
        }
        // If some of the elements are already present in the list then we sholud make the changes in the existing linkedList
        // 1. create a new node 
        // 2. mark newnode's next as the head(as the head value contains the first element)
        // 3. update the head with the newly created node
        else
        {
            Node newNode = new Node(data);
            newNode.next=headPointer;
            headPointer=newNode;
        }
        // If tailpointer is null means only one value is present in the linkedList
        // so they should point the same
        if(tailPointer == null)
        {
            tailPointer=headPointer;
        }
        // Increment the size of the linked list
        size+=1;
    } 

    // Insert at Last

    public void insertAtLast(int data)
    {
        if(tailPointer==null)
        {
            insertAtBeginning(data);
        }
        else
        {
        //create a new node for insertion at last
        Node newNode = new Node(data);
        //make the previous node next to this newly created node as the previous node is pointed by tailPointer
        tailPointer.next=newNode;
        // Update the tailPointer to the newly created node
        tailPointer=newNode;
        size+=1;
        }
    }

    // Insert at position

    public void insertAtIndex(int data,int index)
    {
        //  case-1 If the index is 0 it is same as insert at the beginning
        if(index==0)
        {
            insertAtBeginning(data);
            return;
        }
        
        // case -2 If the index is equals to size of the linkedList then it is insert at the end

        if(index==size)
        {
            insertAtLast(data);
        }

        // case -3 In this case we have to travesre through the linkedList

        // In this case we have to move till that index-1 position 

        Node temp = headPointer;

        // Traversing the linkedList till the node before..
        // Index 0 is the first position it self so the itetration starts form 1
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        // After completion of this for loop we are at the index-1 position
        // now create a newNode

        // as the temp.next stroes the address of the next node we are using the constructor with the address..

        Node newNode = new Node(data,temp.next);

        // Update the temp's next with the new node..
        temp.next=newNode;

        // Increment the size of the linked list 
        size+=1;
    }

    // Deleting the elements from the linked list
    
    // 1. Delete the first element 
    public int deleteAtFirst()
    {
        int value = headPointer.data;
        //Node temp = headPointer;
        headPointer=headPointer.next;
        if(headPointer==null)
        {
            tailPointer=null;
        }
        size-=1;
        return value;
        //ree(temp);
        // temp=null;
    }

    // 2. Delete at last and returning the last value
    public int deleteAtLast()
    {
        if(size<=1)
        {
            return deleteAtFirst();
        }
        Node temp = headPointer.next;
        Node prev = headPointer;
        while(temp.next!=null)
        {
            temp=temp.next;
            prev=prev.next;
        }
        int value = temp.data;
        tailPointer=prev;
        tailPointer.next=null;
        size--;
        return value;
    }

    // 3. Delete a Element at a given item
    public int deleteKey(int key)
    {
        if(searchItem(key)!=1)
        {
            return -1;
        }
        if(headPointer.data==key)
        {
            return deleteAtFirst();
        }
        if(tailPointer.data==key)
        {
            return deleteAtLast();
        }
        Node temp= headPointer.next;
        Node prev = headPointer;
        while(temp.data!=key)
        {
            temp=temp.next;
            prev=prev.next;
        }
        prev.next=temp.next;
        // temp.next=null;
        size-=1;

    return 1;
    }

// Search in the linked list
    public int searchItem(int key)
    {
        Node temp = headPointer;
        while(temp!=null)
        {
            if(temp.data==key)
            return 1;
            temp=temp.next;
        }
        return -1;
    }
    //reverse dispaly
    public void reverseDispaly(Node node)
    {
        if(node!=null)
        {
            reverseDispaly(node.next);
            System.out.print(node.data+"->");
        }
    }
    // Printing the linked list
    public void printList()
    {
        Node temp = headPointer;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}


class Main
{
    public static void main(String[] args)
    {
        //creating a obj for the linkedList class..
        linkedList list = new linkedList();
        list.insertAtBeginning(23);
        list.insertAtBeginning(78);
        list.insertAtBeginning(89);
        list.insertAtBeginning(45);
        list.insertAtLast(996);
        list.insertAtLast(95);
        list.insertAtIndex(36, 5);
        int key = 23;
        //System.out.print("Before deleting "+key+":");
        list.printList();
        // list.deleteAtFirst();
        // list.printList();
       // System.out.println(list.deleteAtLast());
        //list.deleteKey(key);
        //System.out.print("After Deleting "+key+":");
    //    list.printList();
    list.reverseDispaly(list.headPointer);
    
        //System.out.println("Size is:"+list.size);
       //System.out.println(list.searchItem(45));
    }
}