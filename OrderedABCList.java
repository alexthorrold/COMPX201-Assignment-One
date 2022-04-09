public class OrderedABCList extends ABCList {

    /**
     * Constructs a new OrderedABCList, calls superclass constructor
     */
    public OrderedABCList() {
        super();
    }

    /**
     * Writes error message to console as add message should not be used in an OrderedABCList
     * @param c Character that would have been added in an ABCList
     */
    @Override
    public void add(char c) {
        System.out.println("Whoops, an ordered list does not include an 'add' method. Please use 'insert' instead");
    }

    /**
     * Inserts given character in the correct position in the ABCList
     * @param c Character to insert into the OrderedABCList
     */
    public void insert(char c) {
        ABCNode newNode = new ABCNode(c);
        ABCNode back = null;
        ABCNode front = head;

        // Sets node as head if list has no head node
        if (head == null) {
            head = newNode;
        }
        // If given char value is less than current head node's char value,
        // inserts new node at head of linked list
        else if (c <= head.getValue()) {
            newNode.setNext(head);
            head = newNode;
        }
        // Otherwise, finds correct position and adds node there
        else {
            // Iterates through linked list either until a node with a char value greater than
            // given char value is found or until the end of the linked list is reached
            while (front != null && front.getValue() < c) {
                back = front;
                front = front.getNext();
            }

            newNode.setNext(front);
            assert back != null;
            back.setNext(newNode);
        }
    }
}
