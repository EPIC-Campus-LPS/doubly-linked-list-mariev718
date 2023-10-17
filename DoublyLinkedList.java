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
            current.getPreviousNode().setNextNode(tailNode);

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
                headNode.getNextNode().setPreviousNode(headNode);

            }

        } else if(index == size) {

            Node<E> current = new Node(element);
            current.setPreviousNode(tailNode);
            tailNode = current;
            tailNode.getPreviousNode().setNextNode(tailNode);

        } else {

            Node<E> newNode = new Node(element);
            Node<E> current = headNode;

            for(int i = 0; i < index; i++) {

                current = current.getNextNode();

            }

            newNode.setNextNode(current.getNextNode());
            newNode.setPreviousNode(current);
            current.setNextNode(newNode);

        }

        size++;

    }

    public E remove(int index) {

        if(index > size) {

            //throw error

        } if (index == 0) {

            Node<E> temp = headNode;
            headNode = headNode.getNextNode();
            headNode.setPreviousNode(null);

            size--;

            return temp.getValue();

        } else if(index == size - 1) {

            Node<E> temp = tailNode;
            tailNode = tailNode.getPreviousNode();
            tailNode.setNextNode(null);

            size--;

            return temp.getValue();

        } else {

            Node<E> current = headNode;

            for(int i = 0; i < index; i++) {

                current = current.getNextNode();

            }

            Node<E> temp = current.getNextNode();
            current.setNextNode(current.getNextNode().getNextNode());
            current = current.getNextNode();
            current.setPreviousNode(current.getPreviousNode().getPreviousNode());

            size--;

            return temp.getValue();

        }

    }

    public E remove() {

        Node<E> temp = tailNode;
        tailNode = tailNode.getPreviousNode();
        tailNode.setNextNode(null);

        size--;

        return temp.getValue();

    }

    public E set(int index, E element) {

        for(int i = 0; i < index; i++) {



        }

    }

}
