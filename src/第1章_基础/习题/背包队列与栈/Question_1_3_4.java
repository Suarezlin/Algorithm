import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

public class Question_1_3_4 {
    public static void main(String[] args) {
        String test1 = "[()]{}{[()()]()}";
        String test2 = "[(]";
        StdOut.println(isMatch(test1));
        StdOut.println(isMatch(test2));
    }

    public static boolean isMatch(String s) {
        Stack_1_3_4 stack = new Stack_1_3_4();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') stack.push(c);
            else if (c == '}') {
                if ('{' != (char) stack.pop()) return false;
            }
            else if (c == ']') {
                if ('[' != (char) stack.pop()) return false;
            }
            else if (c == ')') {
                if ('(' != (char) stack.pop()) return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}

class Stack_1_3_4<Item> implements Iterable<Item> {
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

    public Stack_1_3_4() {
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

