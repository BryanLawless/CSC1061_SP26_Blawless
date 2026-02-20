import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        array = (T[]) new Object[4];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean add(T e) {
        if (size >= array.length) {
            T[] bigger = (T[]) new Object[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                bigger[i] = array[i];
            }

            array = bigger;
        }

        array[size++] = e;

        return false;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        add(element);

        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'addAll'"
        );
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'addAll'"
        );
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'contains'"
        );
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'containsAll'"
        );
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (equals(array[i], o)) {
                return i;
            }
        }

        return -1;
    }

    private boolean equals(Object o1, Object o2) {
        if (o1 == null || o2 == null) {
            return false;
        }

        return o1.equals(o2);
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'iterator'"
        );
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'lastIndexOf'"
        );
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'listIterator'"
        );
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'listIterator'"
        );
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'remove'"
        );
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'remove'"
        );
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = true;
        for (Object obj : c) {
            remove(obj);
        }

        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'retainAll'"
        );
    }

    @Override
    public T set(int index, T element) {
        T old = get(index);
        array[index] = element;

        return old;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'subList'"
        );
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'toArray'"
        );
    }

    @Override
    public <T> T[] toArray(T[] arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'toArray'"
        );
    }
}
