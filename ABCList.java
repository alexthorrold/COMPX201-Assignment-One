public class ABCList {

    // Head node in the ABCList
    protected ABCNode head;

    /**
     * Constructs a new ABCList with no nodes
     */
    public ABCList() {
        head = null;
    }

    /**
     * Adds a character to the head of the ABCList
     * @param c Character to add to ABCList
     */
    public void add(char c) {
        ABCNode n = new ABCNode(c);

        n.setNext(head);
        head = n;
    }

    /**
     * Checks if the ABCList has a given character
     * @param c Character to search for in ABCList
     * @return Returns whether ABCList contains given character
     */
    public boolean has(char c) {
        ABCNode n = head;

        // Checks each node in the ABCList and returns true if it finds a node with value equal to given char value
        while (n != null) {
            if (n.getValue() == c)
                return true;

            n = n.getNext();
        }

        // Returns false if it has checked the entire ABCList and has not found the given char value
        return false;
    }

    /**
     * Removes the first instance of a given character from the ABCList if present
     * @param c Character to remove from ABCList
     */
    public void remove(char c) {
        // At point of removal holds the node to be removed
        ABCNode front = head;
        // At point of removal holds the node behind the one being removed to set link to the next node
        ABCNode back = null;

        if (head == null) {
            return;
        }

        // If the node to be removed is the head node, sets the next node in the ABCList as the new head
        if (head.getValue() == c) {
            head = head.getNext();
            return;
        }

        // Iterates through all nodes in the ABCList
        // If node with value to be removed is found, sets previous pointer to node after one being removed and returns
        while (front != null) {
            if (front.getValue() == c) {
                assert back != null;
                back.setNext(front.getNext());
                return;
            }

            back = front;
            front = front.getNext();
        }
    }

    /**
     * Gets the length of the ABCList
     * @return Length of ABCList
     */
    public int length() {
        ABCNode n = head;
        int i = 0;

        while (n != null) {
            i++;
            n = n.getNext();
        }

        return i;
    }

    /**
     * Checks whether the ABCList is empty or not
     * @return Whether ABCList is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Writes all characters in the ABCList to console
     */
    public void dump() {
        ABCNode n = head;

        while (n != null) {
            System.out.println(n.getValue());
            n = n.getNext();
        }
    }
}
