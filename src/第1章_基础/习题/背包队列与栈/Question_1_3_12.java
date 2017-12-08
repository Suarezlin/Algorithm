import java.util.Iterator;

public class Question_1_3_12 {
    public static void main(String[] args) {

    }
}

class Stack_1_3_12<Item> implements Iterable<Item> {
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

    public static Stack_1_3_12<String> copy(Stack_1_3_12<String> stack) {
        Stack_1_3_12<String> newStack = new Stack_1_3_12<String>();
        for (String e : stack) {
            newStack.push(e);
        }
        return newStack;
    }

    public Stack_1_3_12() {
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
}