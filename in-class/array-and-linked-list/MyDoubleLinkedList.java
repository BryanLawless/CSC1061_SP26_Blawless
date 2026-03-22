import java.util.List;

public class MyDoubleLinkedList<T> implements List<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size;

    private class Node {

        public T data;
        public Node next;
        public Node prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
