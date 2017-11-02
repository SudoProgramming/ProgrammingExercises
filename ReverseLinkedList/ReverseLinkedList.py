class Node:
  """A Node class with an integer value and a single link to the next Node"""
 
  def __init__(self, data, next=None):
    """Initializes a new instance of the Node class"""
    self.data = data
    self.next = next
   
def ReverseLinkedList(head):
  """Reverses the Singular Linked List Iteratively"""
  # Initalizes tracking variables so we can freely reverse without dropping a node
  currentNode = head
  previousNode = None
  nextNode = None
 
  # Keeps reversing links, and moving through the list while we have a node to reverse
  while (currentNode != None):
    nextNode = currentNode.next       # We first set the nextNode using our current node, we have to set this first since we have to break the currentNodes link.
    currentNode.next = previousNode   # We are going to break the old link for the current node, and reverse it to point to the previous node
    previousNode = currentNode        # Now that the current node is pointing to the correct direction, we can move on to the next node AFTER update our previousNode variable
    currentNode = nextNode            # Now we update our currentNode variable since we have moved on to the next node
 
  # Returns the previous node, since the currentNode must be null
  return previousNode