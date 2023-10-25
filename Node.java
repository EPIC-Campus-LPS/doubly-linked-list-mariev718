/**
 * Class to create and manipulate nodes
 *
 * @author Marie Viita
 * @param <E>
 */
public class Node<E> {

    // PIVs
    private E value;
    private Node<E> next = null;
    private Node<E> previous = null;


    // constructors
    public Node() {

    }

    public Node(E element) {

        value = element;

    }

    public Node(E element, Node<E> nextNode) {

        value = element;
        next = nextNode;

    }

    public Node(E element, Node<E> nextNode, Node<E> lastNode) {


        value = element;
        next = nextNode;
        previous = lastNode;

    }


    // getters

    /**
     * Gets value of node
     *
     * @return value of node
     */
    public E getValue() {

        return value;

    }

    /**
     * Gets next node
     *
     * @return next node
     */
    public Node<E> getNextNode() {

        return next;

    }

    /**
     * Gets previous node
     *
     * @return previous node
     */
    public Node<E> getPreviousNode() {

        return previous;

    }


    // setters

    /**
     * sets value of node
     *
     * @param element value to be set
     */
    public void setValue(E element) {

        value = element;

    }

    /**
     * Sets next node
     *
     * @param nextNode node to be pointed to
     */
    public void setNextNode(Node<E> nextNode) {

        next = nextNode;

    }

    /**
     * Sets previous node
     *
     * @param lastNode node to be pointed to
     */
    public void setPreviousNode(Node<E> lastNode) {

        previous = lastNode;

    }

}
