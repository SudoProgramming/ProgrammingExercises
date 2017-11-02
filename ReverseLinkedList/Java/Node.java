/// <summary>
/// A Node class with an integer value and a single link to the next Node
/// </summary>
public class Node {
    /// <summary>
    /// A single link to the next node
    /// </summary>
    public Node next;

    /// <summary>
    /// The value within the Node
    /// </summary>
    public int data;

    /// <summary>
    /// Initializes a new instance of the <see cref="Node"/> class.
    /// </summary>
    /// <param name="value">The integer value within a node</param>
    /// <param name="next">The linked node</param>
    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    /// <summary>
    /// Initializes a new instance of the <see cref="Node"/> class.
    /// </summary>
    /// <param name="value">The integer value within a node</param>
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}