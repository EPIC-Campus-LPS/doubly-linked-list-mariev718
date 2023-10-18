import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    @DisplayName("Return value of node at index")
    void get() {

        DoublyLinkedList<Integer> test = new DoublyLinkedList<Integer>();
        test.add(1);
        test.add(2);
        test.add(-3);

        assertAll(() -> assertEquals(1, test.get(0)),
                () -> assertEquals(2, test.get(1)),
                () -> assertEquals(-3, test.get(2)));
    }

    @Test
    @DisplayName("Returns node at index")
    void getNode() {

        DoublyLinkedList<Integer> test5 = new DoublyLinkedList<Integer>();
        test5.add(1);
        test5.add(2);
        test5.add(-3);

        assertAll(() -> assertEquals(1, test5.getNode(0).getValue()),
                () -> assertEquals(2, test5.getNode(1).getValue()),
                () -> assertEquals(-3, test5.getNode(2).getValue()));

    }

    @Test
    @DisplayName("Add to end of list")
    void add() {

        DoublyLinkedList<Integer> test2 = new DoublyLinkedList<>();
        test2.add(1);

        assertEquals(1, test2.get(0));

        test2.add(-5);

        assertEquals(-5, test2.get(1));

        test2.add(100);

        assertEquals(100, test2.get(2));

    }

    @Test
    @DisplayName("Add node to list at specific index")
    void testAdd() {

        DoublyLinkedList<Integer> test3 = new DoublyLinkedList<Integer>();

        test3.add(0, 1);
        test3.add(0, 2);

        assertEquals(2, test3.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> test3.add(3, 0));

        test3.add(2, 3);

        assertEquals(3, test3.get(2));
        assertEquals(3, test3.getSize());
        assertEquals(null, test3.getNode(0).getPreviousNode());
        assertEquals(1, test3.getNode(0).getNextNode().getValue());

        test3.add(3, 4);

        assertEquals(4, test3.get(3));
        assertEquals(3, test3.getNode(3).getPreviousNode().getValue());
        assertEquals(null, test3.getNode(3).getNextNode());

    }

    @Test
    @DisplayName("Removes node and returns the removed value at a specific index")
    void remove() {

        DoublyLinkedList<String> test4 = new DoublyLinkedList<>();
        test4.add("ab");
        test4.add("cd");
        test4.add("ef");

        assertThrows(IndexOutOfBoundsException.class, () -> test4.remove(3));

        Node<String> toRemove = test4.getNode(1);

        assertEquals(toRemove.getValue(), test4.remove(1));

        Node<String> temp = test4.getNode(0);

        assertEquals(temp, test4.getNode(1).getPreviousNode());

        assertEquals(null, test4.getNode(1).getNextNode());

        test4.remove(1);

    }

    @Test
    @DisplayName("Removes tail node and returns its value")
    void testRemove() {

        DoublyLinkedList<String> test4 = new DoublyLinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> test4.remove());

        test4.add("ab");
        test4.add("cd");
        test4.add("ef");

        assertEquals(test4.get(2), test4.remove());
        assertEquals("ab", test4.getNode(1).getPreviousNode().getValue());

    }

    @Test
    void set() {
    }

    @Test
    void testToString() {
    }
}