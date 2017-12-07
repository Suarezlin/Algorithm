import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Question_1_3_9 {
    public static String complete(String s) {
        Stack_1_3_9<String> ops = new Stack_1_3_9<String>();
        Stack_1_3_9<String> vals = new Stack_1_3_9<String>();
        String[] a = s.split("\\s+");
        for (String st : a) {
            if (st.equals("+")) ops.push(st);
            else if (st.equals("-")) ops.push(st);
            else if (st.equals("*")) ops.push(st);
            else if (st.equals("/")) ops.push(st);
            else if (st.equals(")")) {
                String aa = vals.pop();
                String bb = vals.pop();
                vals.push("( " + bb + " " + ops.pop() + " " + aa + " )");
            }
            else vals.push(st);
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String s = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        s = complete(s);
        StdOut.println(s);
    }
}

class Stack_1_3_9<Item> implements Iterable<Item> {
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

    public Stack_1_3_9() {
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
}
