class node:
    
    #defining a node
    
    def __init__(self,data):
        self.data=data
        self.next=None
    
class LinkedList:
    
    def __init__(self):
        self.head=None


l=LinkedList() #start with empty list
l.head=node(1) # having first node as head node holds data value as 1 and next field as None
second=node(2) # second node having data value as 2 and next field as None
third=node(3) # third node having data value as 3 and next field as None


# linking the nodes
l.head.next=second # 1->2

second.next=third # 2->3

# as already third next part is null we don't want to specify taht explicitly

print(l.head) # prints the address of the head node
print(l.head.data) #prints the data in the head node 1 in this case

print(l.head.next) # prints the address of the node next to head node

print(l.head.next.data) #prints 2 

