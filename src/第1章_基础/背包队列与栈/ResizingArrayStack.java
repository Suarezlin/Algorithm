import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] array;
    private int N;

    public ResizingArrayStack() {
        array = (Item[]) new Object[1];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == array.length;
    }

    public boolean isQuarter() {
        return N > 0 && N == array.length / 4;
    }

    public int size() {
        return N;
    }

    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void push(Item item) {
        if (isFull()) resize(2 * array.length);
        array[N++] = item;
    }

    public Item pop() {
        Item item = array[--N];
        array[N] = null;
        if (isQuarter()) resize(array.length / 2);
        return item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return array[--i];
        }

        public void remove() {
        }
    }

    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        for (String element : stack) {
            StdOut.println(element);
        }
    }

}
