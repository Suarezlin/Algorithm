import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Question_1_3_10 {
    public static String InfixtoPostfix(String string) {
        Stack_1_3_10<String> ops = new Stack_1_3_10<String>();
        Stack_1_3_10<String> vals = new Stack_1_3_10<String>();
        String result = "";
        for (String s : string.split("\\s+")) {
            if (s.equals("(")) ops.push(s);
            else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                while (!ops.isEmpty() && !ops.peek().equals("(") && !isLowerOperator(ops.peek(), s)) {
                    result += ops.pop();
                }
                ops.push(s);
            } else if (s.equals(")")) {
                while (!ops.peek().equals("(")) {
                    result += ops.pop();
                }
                if (ops.peek().equals("(")) ops.pop();
            } else result += s;
        }
        while (!ops.isEmpty()) {
            result += ops.pop();
        }
        return result;
    }

    public static boolean isLowerOperator(String a, String b) {
        if (a.equals("+") || a.equals("-")) {
            if (b.equals("+") || b.equals("-")) return false;
            else return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String input = "2 * 3 / ( 2 - 1 ) + 3 * ( 4 - 1 )";
        StdOut.println(InfixtoPostfix(input));
    }

}

class Stack_1_3_10<Item> implements Iterable<Item> {
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

    public Stack_1_3_10() {
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