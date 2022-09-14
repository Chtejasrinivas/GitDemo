class node:
    
    def __init__(self,data):
        self.data=data
        self.next=None
    
class LinkedList:
    
    def __init__(self):
        self.head=None
        
    # print function
    
    def printList(self):
        temp=self.head
    # creating a temp variable to store the address of the head node so that we can refer to the temp 
    # rather than the  head node in future requirement
        while(temp!=None): # while temp!=NULL because at last node the temp = None
            
            print(temp.data) # printing the data in the data part of the linked list
            temp=temp.next   # moving one node ahead
    

l=LinkedList()
l.head=node(1) # having first node as head node holds data value as 1 and next field as None
second=node(2) # second node having data value as 2 and next field as None
third=node(3) # third node having data value as 3 and next field as None

# linking the nodes

l.head.next=second

second.next=third

l.printList()
