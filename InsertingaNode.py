class node:
    
    def __init__(self,data):
        self.data=data
        self.next=None
    
class LinkedList:
    
    def __init__(self):
        self.head=None
        
    
    # inserting a node at beginning
    def insertatbeginning(self,data):
        # This involves three steps
        
        # step-1 create a new node with the given data
        new_node=node(data)
        
        #check is there are elements in the list or not
        if self.head is None:  #then there are no elements in the list
            self.head=new_node
            return
    
        # step 2 make the new node next as head
        new_node.next=self.head
        
        # step 3 make the new node as head node
        
        self.head = new_node
        
        print("node with data as "+str(data)+" inserted successsfully")
        
    #inserting a node at a given position
    
    def insertatPosition(self, prev,data):
        #check if the prev node is present in the list or not
        if prev is None:
            print("No such node is in the list")
            return
        
        else:
        
            #create a new node with data
            new_node=node(data)   
                
            #set the next of new node to previous node next
            new_node.next=prev.next
            
            #set the previous next to current new node
            prev.next=new_node
            
            print("node after "+str(prev.data)+" inserted successsfully")
    
    def insertatend(self,data):
        #step-1 create a new_node with the data
        new_node=node(data)
        # if there are no elements in the list make this node as head node
        if self.head is None:
            self.head=new_node
            return
        # if there are elements in the list then traverse the list untill last element
        temp=self.head
        while(temp.next):
            temp=temp.next
        # now we are at the last position of the linked list
        
        #now set this last node next as the new_node 
        temp.next=new_node  
      
        
    def printList(self):
        temp=self.head
        
        if temp==None:
            print("No elements in the list")
        
        while(temp):
            print(temp.data,end=" ")
            temp=temp.next
        
        
        
        
l=LinkedList()
l.insertatbeginning(1)
l.insertatPosition(l.head.next,2)
# l.insertatend(5)
# l.insertatend(6)
l.printList()
# print(l.head)





        