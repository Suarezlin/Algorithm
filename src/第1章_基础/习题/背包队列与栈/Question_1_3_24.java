import java.util.Iterator;

public class Question_1_3_24 {

}

class Stack_1_3_24<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    private class Node {
        private Item item;
        private Node next;

        public boolean equals(Node that) {
            return that.item == item;
        }
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

    public Stack_1_3_24() {
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

    public void removeAfter(Node node) {
        Node current = first;
        while (!current.equals(node) && current != null) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}