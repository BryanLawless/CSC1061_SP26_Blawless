import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A doubly linked list implementation.
 * @param <E> the type of elements
 */
public class MyDoubleLinkedList<E> implements List<E> {

    /**
     * Node for the linked list.
     */
    private class Node {

        public E data;
        public Node next;
        public Node prev;

        /**
         * Creates a new node.
         * @param data the data to store
         */
        public Node(E data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        /**
         * Creates a new node with next reference.
         * @param data the data to store
         * @param next the next node
         */
        @SuppressWarnings("unused")
        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
            if (next != null) {
                next.prev = this;
            }
        }

        @Override
        public String toString() {
            return "Node(" + data.toString() + ")";
        }
    }

    private int size;
    private Node head;
    private Node tail;

    /**
     * Creates an empty list.
     */
    public MyDoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Adds element to end of list.
     * @param element the element to add
     * @return true
     */
    @Override
    public boolean add(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    /**
     * Adds element at index.
     * @param index the position to insert
     * @param element the element to add
     */
    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else {
            Node node = getNode(index - 1);
            newNode.next = node.next;
            newNode.prev = node;
            if (node.next != null) {
                node.next.prev = newNode;
            } else {
                tail = newNode;
            }
            node.next = newNode;
        }
        size++;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        boolean flag = true;
        for (E element : collection) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /**
     * Removes all elements.
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Gets element at index.
     * @param index the position
     * @return the element
     */
    @Override
    public E get(int index) {
        Node node = getNode(index);
        return node.data;
    }

    /**
     * Gets node at index.
     * @param index the position
     * @return the node
     */
    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    /**
     * Finds index of element.
     * @param target the element to find
     * @return the index or -1
     */
    @Override
    public int indexOf(Object target) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (equals(target, node.data)) {
                return i;
            }

            node = node.next;
        }

        return -1;
    }

    /**
     * Checks if target equals element.
     * @param target the target
     * @param element the element
     * @return true if equal
     */
    private boolean equals(Object target, Object element) {
        if (target == null) {
            return element == null;
        } else {
            return target.equals(element);
        }
    }

    /**
     * Checks if list is empty.
     * @return true if empty
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Iterator<E> iterator() {
        E[] array = (E[]) toArray();
        return Arrays.asList(array).iterator();
    }

    @Override
    public int lastIndexOf(Object target) {
        Node node = head;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (equals(target, node.data)) {
                index = i;
            }

            node = node.next;
        }

        return index;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    /**
     * Removes first occurrence of element.
     * @param obj the element to remove
     * @return true if removed
     */
    @Override
    public boolean remove(Object obj) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (equals(obj, node.data)) {
                break;
            }

            node = node.next;
        }

        if (node == null) {
            return false;
        }

        // Remove the node
        if (head == node) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else {
            node.prev.next = node.next;
            if (node.next != null) {
                node.next.prev = node.prev;
            } else {
                tail = node.prev;
            }
        }

        size--;

        return true;
    }

    /**
     * Removes element at index.
     * @param index the position
     * @return the removed element
     */
    @Override
    public E remove(int index) {
        E element = get(index);
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else {
            Node node = getNode(index - 1);
            node.next = node.next.next;
            if (node.next != null) {
                node.next.prev = node;
            } else {
                tail = node;
            }
        }

        size--;

        return element;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean flag = true;
        for (Object obj : collection) {
            flag &= remove(obj);
        }

        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /**
     * Replaces element at index.
     * @param index the position
     * @param element the new element
     * @return the old element
     */
    @Override
    public E set(int index, E element) {
        Node node = getNode(index);
        E old = node.data;
        node.data = element;
        return old;
    }

    /**
     * Gets the size.
     * @return the number of elements
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        MyDoubleLinkedList<E> list = new MyDoubleLinkedList<E>();
        for (Node node = head; node != null; node = node.next) {
            if (i >= fromIndex && i <= toIndex) {
                list.add(node.data);
            }

            i++;
        }

        return list;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;

        for (Node node = head; node != null; node = node.next) {
            array[i] = node.data;
            i++;
        }

        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    /**
     * Counts the elements.
     * @return the number of elements
     */
    public int count() {
        return size;
    }

    /**
     * Reverses the list order.
     */
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        Node temp = null;

        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Swap head and tail
        temp = head;
        head = tail;
        tail = temp;
    }
}
