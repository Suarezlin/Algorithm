import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class NodeStack<Item> implements Iterable<Item> {
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

    public NodeStack() {
        first = null;
        N = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        N++;
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Item pop() {
        Item value = first.item;
        first = first.next;
        N--;
        return value;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public static void main(String[] args) {
        NodeStack<String> stack = new NodeStack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        for (String s : stack) {
            StdOut.println(s);
        }
    }
}
