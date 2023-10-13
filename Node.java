public class Node<E> {

    // PIVs
    private E value;
    private Node<E> next;
    private Node<E> previous;


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
    public E getValue() {

        return value;

    }

    public Node<E> getNextNode() {

        return next;

    }

    public Node<E> getPreviousNode() {

        return previous;

    }


    // setters
    public void setValue(E element) {

        value = element;

    }

    public void setNextNode(Node<E> nextNode) {

        next = nextNode;

    }

    public void setPreviousNode(Node<E> lastNode) {

        previous = lastNode;

    }

}
