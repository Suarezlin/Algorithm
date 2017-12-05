import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class NodeBag<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    private class Node {
        private Item item;
        private Node next;
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item value = current.item;
            current = current.next;
            return value;
        }

        public void remove() {
        }
    }

    public NodeBag() {
        first = null;
        N = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void add(Item item) {
        N++;
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public static void main(String[] args) {
        NodeBag<String> stack = new NodeBag<String>();
        stack.add("a");
        stack.add("b");
        stack.add("c");
        stack.add("d");
        stack.add("e");
        stack.add("f");
        for (String s : stack) {
            StdOut.println(s);
        }
    }
}
