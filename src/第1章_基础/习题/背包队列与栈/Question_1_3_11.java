import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Question_1_3_11 {
    /*
    后序表达式求值，从左向右扫描，为操作数，入栈
    为运算符，栈顶两元素出栈，计算后入栈，继续操作
     */
    public static double EvaluatePostfix(String postfix) {
        Stack_1_3_11<Double> vals = new Stack_1_3_11<Double>();
        for (String s : postfix.split("\\s+")) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                if (s.equals("+")) vals.push(vals.pop() + vals.pop());
                else if (s.equals("-")) vals.push(- vals.pop() + vals.pop());
                else if (s.equals("*")) vals.push(vals.pop() * vals.pop());
                else if (s.equals("/")) vals.push(1 / (vals.pop() / vals.pop()));
            }
            else {
                vals.push(Double.parseDouble(s));
            }
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String postfix = "2 3 * 2 1 - / 3 4 1 - * +";
        StdOut.println(EvaluatePostfix(postfix));
    }

}

class Stack_1_3_11<Item> implements Iterable<Item> {
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

    public Stack_1_3_11() {
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