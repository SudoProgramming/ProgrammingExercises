/**
* A Node class with an integer value and a single link to the next Node
*/
public class Node {
    public Node next;

    public int data;

    /**
    * Initializes a new instance of the Node class.
    *
    * @param data The integer value within a node
    * @param next The linked node
    */
    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    /**
    * Initializes a new instance of the Node class.
    *
    * @param data The integer value within a node
    */
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}