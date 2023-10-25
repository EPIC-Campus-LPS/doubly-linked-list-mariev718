/**
 * Class to create and manipulate a doubly linked list
 *
 * @author Marie Viita
 * @param <E>
 */
public class DoublyLinkedList<E> {

    // PIVs
    private int size = 0;
    private Node<E> headNode;
    private Node<E> tailNode;

    /**
     * Gets the value of a node at a specific index
     *
     * @param index
     * @return The value of the node at a specific index
     */
    public E get(int index) {

        // Throws an error if the index is not in the list
        if (index >= size || index < 0) {

            throw new IndexOutOfBoundsException();

        }

        Node<E> current = headNode;

        for (int i = 0; i < index; i++) {

            current = current.getNextNode();

        }

        return current.getValue();

    }

    /**
     * Gets the node at a specific index
     *
     * @param index
     * @return Node
     */
    public Node<E> getNode(int index) {

        Node<E> current = headNode;

        for (int i = 0; i < index; i++) {

            current = current.getNextNode();

        }

        return current;

    }

    /**
     * Returns the size of the list
     *
     * @return size
     */
    public int getSize() {

        return size;

    }

    /**
     * Adds a node to the end of a list
     *
     * @param element
     */
    public void add(E element) {

        if (size == 0) {

            headNode = new Node(element);
            tailNode = headNode;

        } else {

            Node<E> current = new Node(element);
            current.setPreviousNode(tailNode);
            tailNode = current;
            current.getPreviousNode().setNextNode(tailNode);

        }

        size++;

    }

    /**
     * Adds a node to specific index
     *
     * @param index the index the node should be added at
     * @param element the value of the node
     */
    public void add(int index, E element) {

        // Throws an error if the index is not in the list
        if (index > size || index < 0) {

            throw new IndexOutOfBoundsException();

        } else if (index == 0) {

            if (size == 0) {

                headNode = new Node(element);
                tailNode = headNode;

            } else {

                headNode = new Node(element, headNode);
                headNode.getNextNode().setPreviousNode(headNode);

            }

        } else if (index == size) {

            Node<E> current = new Node(element);
            current.setPreviousNode(tailNode);
            tailNode = current;
            tailNode.getPreviousNode().setNextNode(tailNode);

        } else {

            Node<E> newNode = new Node(element);
            Node<E> current = headNode;

            for (int i = 0; i < index; i++) {

                current = current.getNextNode();

            }

            newNode.setNextNode(current.getNextNode());
            newNode.setPreviousNode(current);
            current.setNextNode(newNode);

        }

        size++;

    }

    /**
     * Removes a node from a specific index
     *
     * @param index the index the node is removed from
     * @return the value of the removed node
     */
    public E remove(int index) {

        // Throws an error if the index is not in the list
        if (index >= size || index < 0) {

            throw new IndexOutOfBoundsException();

        } else if (index == 0) {

            Node<E> temp = headNode;
            headNode = headNode.getNextNode();
            headNode.setPreviousNode(null);

            size--;

            return temp.getValue();

        } else if (index == size - 1) {

            Node<E> temp = tailNode;
            tailNode = tailNode.getPreviousNode();
            tailNode.setNextNode(null);

            size--;

            return temp.getValue();

        } else {

            Node<E> current = headNode;

            for (int i = 0; i < index; i++) {

                current = current.getNextNode();

            }

            Node<E> temp = current.getNextNode();
            current.getPreviousNode().setNextNode(temp);
            temp.setPreviousNode(current.getPreviousNode());

            size--;

            return current.getValue();

        }

    }

    /**
     * Removes node at end of list
     *
     * @return Value of removed node
     */
    public E remove() {

        // Throws an error if there is nothing to remove
        if(size == 0) {

            throw new IndexOutOfBoundsException();

        }

        Node<E> temp = tailNode;
        tailNode = tailNode.getPreviousNode();
        tailNode.setNextNode(null);

        size--;

        return temp.getValue();

    }

    /**
     * Sets the value of a node at a specific index
     *
     * @param index the index at which the value of the node is set
     * @param element the value to set the node to
     * @return the previous value of the node
     */
    public E set(int index, E element) {

        // Throws an error if the index is not in the list
        if (index >= size || index < 0) {

            throw new IndexOutOfBoundsException();

        }

        Node<E> current = headNode;

        for (int i = 0; i < index; i++) {

            current = current.getNextNode();

        }

        E temp = current.getValue();
        current.setValue(element);

        return temp;

    }

    /**
     * Returns a string list of the list
     *
     * @return String listing what's in the list
     */
    public String toString() {

        if (size == 0) {

            return "List is Empty";

        }

        Node<E> current = headNode;
        String list = "[";

        while (current.getNextNode() != null) {

            list += current.getValue();
            list += ", ";
            current = current.getNextNode();

        }

        list += current.getValue();
        list += "]";

        return list;

    }

}
