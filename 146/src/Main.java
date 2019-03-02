public class Main {

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        int a = obj.get(2);
        obj.put(2,6);
        int b = obj.get(1);
        obj.put(1,5);
        obj.put(1,2);
        int c = obj.get(1);
        int d = obj.get(2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // 1, -1, -1, 3, 4
    }
}
