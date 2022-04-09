public class ABCNode {

    // Value of the node
    private char value;
    // Next node in node's ABCList
    private ABCNode next;

    /**
     * Constructs a new ABCNode with a given char value
     * @param value Value to be assigned to the node
     */
    public ABCNode(char value) {
        this.value = value;
        next = null;
    }

    /**
     * Gets node value
     * @return Returns char value of the node
     */
    public char getValue() {
        return value;
    }

    /**
     * Sets node value
     * @param value Value to give to node
     */
    public void setValue(char value) {
        this.value = value;
    }

    /**
     * Gets next ABCNode in an ABCList
     * @return Next ABCNode in an ABCList
     */
    public ABCNode getNext() {
        return next;
    }

    /**
     * Sets next ABCNode in an ABCList
     * @param next Node that will
     */
    public void setNext(ABCNode next) {
        this.next = next;
    }
}
