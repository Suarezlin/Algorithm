import edu.princeton.cs.algs4.StdOut;

public class Counter {
    private String id;
    private int count;

    public Counter(String s) {
        id = s;
        count = 0;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    public String toString() {
        return "Counter id: " + id + " count: " + String.valueOf(count);
    }

    public static void main(String[] args) {
        Counter count = new Counter("Counter");
        count.increment();
        count.increment();
        StdOut.println(count.tally());
        StdOut.println(count.toString());
    }
}
