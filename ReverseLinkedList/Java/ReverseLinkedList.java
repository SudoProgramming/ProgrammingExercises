/**
* A ReverseLinkedList class to reverse a linked list with the head or the list
*/
public class ReverseLinkedList {
    /**
    * Reverses the Singular Linked List Iteratively
    *
    * @param head The head of the linked list
    * @return Node The head of the reversed linked list
    */
    public static Node ReverseLinkedList(Node head)
    {
        // Initalizes tracking variables so we can freely reverse without dropping a node
        Node currentNode = head;
        Node previousNode = null;
        Node nextNode = null;

        // Keeps reversing links, and moving through the list while we have a node to reverse
        while (currentNode != null)
        {
            nextNode = currentNode.next;        // We first set the nextNode using our current node, we have to set this first since we have to break the currentNodes link.
            currentNode.next = previousNode;    // We are going to break the old link for the current node, and reverse it to point to the previous node
            previousNode = currentNode;         // Now that the current node is pointing to the correct direction, we can move on to the next node AFTER update our previousNode variable
            currentNode = nextNode;             // Now we update our currentNode variable since we have moved on to the next node
        }

        // Updates the Head to be the last node, since the currentNode must be null
        return previousNode;
    }
}