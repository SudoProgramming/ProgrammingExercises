/// <summary>
/// A Node class with an integer value and a single link to the next Node
/// </summary>
public class Node
{
    /// <summary>
    /// A single link to the next node
    /// </summary>
    public Node Next { get; set; }

    /// <summary>
    /// The value within the Node
    /// </summary>
    public int Data { get; protected set; }

    /// <summary>
    /// Initializes a new instance of the <see cref="Node"/> class.
    /// </summary>
    /// <param name="data">The integer value within a node</param>
    /// <param name="next">The linked node</param>
    public Node(int data, Node next=null)
    {
        this.Data = data;
        this.Next = next;
    }
}

/// <summary>
/// Reverses the Singular Linked List Iteratively
/// </summary>
/// <param name="head">The head of the linked list</param>
/// <returns>The head of the reversed linked list</returns>
public Node ReverseLinkedList(Node head)
{
    // Initalizes tracking variables so we can freely reverse without dropping a node
    Node currentNode = head;
    Node previousNode = null;
    Node nextNode = null;

    // Keeps reversing links, and moving through the list while we have a node to reverse
    while (currentNode != null)
    {
        nextNode = currentNode.Next;        // We first set the nextNode using our current node, we have to set this first since we have to break the currentNodes link.
        currentNode.Next = previousNode;    // We are going to break the old link for the current node, and reverse it to point to the previous node
        previousNode = currentNode;         // Now that the current node is pointing to the correct direction, we can move on to the next node AFTER update our previousNode variable
        currentNode = nextNode;             // Now we update our currentNode variable since we have moved on to the next node
    }

    // Updates the Head to be the last node, since the currentNode must be null
    return previousNode;
}