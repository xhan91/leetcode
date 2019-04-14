class MyLinkedList {

    Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = new Node(0, null);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node c = head;
        for (int i = 0; i < index; i++) {
            if (c.next == null) return -1;
            c = c.next;
        }
        if (c.next == null) return -1;
        return c.next.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val, head.next);
        head.next = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val, null);
        Node c = head;
        while(c.next != null) {
            c = c.next;
        }
        c.next = node;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node c = head;
        for (int i = 0; i < index; i++) {
            if (c.next == null) return;
            c = c.next;
        }
        Node node = new Node(val, c.next);
        c.next = node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node c = head;
        for (int i = 0; i < index; i++) {
            if (c.next == null) return;
            c = c.next;
        }
        Node n = c.next;
        if (n == null || n.next == null) return;
        c.next = n.next;
        n.next = null;
    }

    class Node {
        Node next;
        int val;

        Node(int _val, Node _next) {
            this.val = _val;
            this.next = _next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */