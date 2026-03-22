import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> {

    private static final double LOAD_FACTOR_THRESHOLD = 0.5;
    private static final int INIT_NUM_BUCKETS = 4;

    private LinkedList<Entry<K, V>>[] buckets;
    private int size;

    private class Entry<K, V> implements Map.Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }

    public MyHashMap() {
        buckets = new LinkedList[INIT_NUM_BUCKETS];
        for (int i = 0; i < INIT_NUM_BUCKETS; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = null;
        }

        size = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (LinkedList<Entry<K, V>> entry : bucket) {}
    }
}
