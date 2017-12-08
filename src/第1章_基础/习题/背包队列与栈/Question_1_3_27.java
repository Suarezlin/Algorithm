import edu.princeton.cs.algs4.StdOut;

public class Question_1_3_27<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public Question_1_3_27() {
        N = 0;
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            first = last;
        }
        else {
            oldlast.next = last;
        };
        last.next = first;
        N++;
    }

    public Item dequeue() {
        N--;
        Item result = last.next.item;
        first = first.next;
        if (!isEmpty()) last.next = last.next.next;
        else last = first;
        return result;
    }

    public static void main(String[] args) {
        Question_1_3_27<String> queue = new Question_1_3_27<String>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        StdOut.print(queue.dequeue());
        StdOut.print(queue.dequeue());
        StdOut.print(queue.dequeue());
        StdOut.print(queue.dequeue());
    }
}
