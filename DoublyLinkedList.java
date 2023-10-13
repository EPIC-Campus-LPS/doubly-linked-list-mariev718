public class DoublyLinkedList<E> {

    private int size = 0;
    private Node<E> headNode;
    private Node<E> tailNode;

    public void add(E element) {

        if(size == 0) {

            headNode = new Node(element);
            tailNode = headNode;

        } else {

            Node<E> current = new Node(element);
            current.setPreviousNode(tailNode);
            tailNode = current;

        }

        size++;

    }

    public void add(int index, E element) {

        if(index > size) {

            //throw error

        } else if(index == 0) {

            if(size == 0) {

                headNode = new Node(element);
                tailNode = headNode;

            } else {

                headNode = new Node(element, headNode);

            }

        } else if(index == size) {

            Node<E> current = new Node(element);
            current.setPreviousNode(tailNode);
            tailNode = current;

        } else {

            Node<E> newNode = new Node(element);
            Node<E> current = headNode;

            for(int i = 0; i < index; i++) {

                current = current.getNextNode();

            }

            newNode.setNexNode
            current.setNextNode(newNode);

        }

    }

}
