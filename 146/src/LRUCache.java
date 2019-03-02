import java.util.HashMap;
import java.util.LinkedList;

class LRUCache {

    private HashMap<Integer, Integer> map;
    private LinkedList<Integer> values;
    private int capacity;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
        this.values = new LinkedList<>();
    }

    public int get(int key) {
        if (this.map.containsKey(key)) {
            this.values.removeFirstOccurrence(key);
            this.values.addFirst(key);
            return this.map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (this.map.containsKey(key)) {
            this.map.put(key, value);
            this.values.removeFirstOccurrence(key);
            this.values.addFirst(key);
        } else {
            if (this.values.size() == capacity) {
                Integer k = this.values.pollLast();
                this.map.remove(k);
            }
            this.map.put(key, value);
            this.values.addFirst(key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */