import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Question_1_3_1 {
    private String[] a; // 储存栈内容的数组
    private int N; // 栈内元素的个数

    public Question_1_3_1(int N) {
        a = new String[N];
        this.N = 0;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public int size() {
        return N;
    }

    public static void main(String[] args) {
        Question_1_3_1 stack = new Question_1_3_1(100);
        for (int i = 0; i < 100; i++) {
            stack.push(String.valueOf(i));
            StdOut.println(stack.isFull());
        }
    }
}
