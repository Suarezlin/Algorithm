import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class NodeQueue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        private Item value;
        private Node next;
    }

    private class QueueIterator implements Iterator<Item> {
        private Node current = first;

        /*
        根据循环：
        for (Node x = first; x != null; x.next) {
            处理代码
        }
        */
        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item value = current.value;
            current = current.next;
            return value;
        }

        public void remove() {
        }
    }

    public NodeQueue() {
        first = null;
        last = null;
        N = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.value = item;
        last.next = null;
        if (!isEmpty()) oldlast.next = last;
        else first = last;
        N++;
    }

    public Item dequeue() {
        N--;
        Item item = first.value;
        first = first.next;
        if (isEmpty()) last = first;
        return item;
    }

    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    public static void main(String[] args) {
        NodeQueue<String> queue = new NodeQueue<String>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        queue.enqueue("f");
        for (String s : queue) {
            StdOut.println(s);
        }
    }
}
