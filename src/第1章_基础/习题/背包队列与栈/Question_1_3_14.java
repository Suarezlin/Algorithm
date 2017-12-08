import edu.princeton.cs.algs4.StdOut;

public class Question_1_3_14 {
    private String[] array;
    private int N;

    public Question_1_3_14() {
        N = 0;
        array = new String[1];
    }

    private boolean isFull() {
        return N == array.length;
    }

    private boolean isQuarter() {
        return N == array.length / 4;
    }

    private void resize(int max) {
        String[] newArray = new String[max];
        for (int i = 0; i < N; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void enqueue(String s) {
        if (isFull()) resize(2 * array.length);
        array[N++] = s;
    }

    private void move() {
        String[] newArray = new String[array.length];
        for (int i = 1; i < N; i++) {
            newArray[i - 1] = array[i];
        }
        array = newArray;
    }

    public String dequeue() {
        String result = array[0];
        move();
        N--;
        if (isQuarter()) resize(array.length / 2);
        return result;
    }

    public static void main(String[] args) {
        Question_1_3_14 queue = new Question_1_3_14();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        StdOut.print(queue.dequeue());
        StdOut.print(queue.dequeue());
        StdOut.print(queue.dequeue());
        StdOut.print(queue.dequeue());
        StdOut.print(queue.dequeue());
    }
}
