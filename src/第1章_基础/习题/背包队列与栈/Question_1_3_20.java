import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Question_1_3_20 {
    public static void main(String[] args) {
        Stack_1_3_20<String> stack = new Stack_1_3_20<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        for (String s : stack) StdOut.print(s);
        stack.delete(3);
        StdOut.println();
        for (String s : stack) StdOut.print(s);
    }
}

class Stack_1_3_20<Item> implements Iterable<Item> {
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

    public Stack_1_3_20() {
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

    public Item peek() {
        return first.item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    public void delete(int k) {
        Node current = first;
        for (int i = 0; i < k - 1; i++) {
            if (current.next != null && current != null) {
                current = current.next;
            }
            else new RuntimeException("illgel k");
        }
        current.next = current.next.next;
    }
}