import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ResizeStack<Item> {
    private Item[] a;
    private int N;

    public ResizeStack() {
        a = (Item[]) new Object[1];
        N = 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public boolean isQuarter() {
        return N > 0 && N < a.length / 4;
    }

    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) temp[i] = a[i];
        a = temp;
    }

    public void push(Item item) {
        if (isFull()) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null; // 避免对象游离
        if (isQuarter()) resize(a.length / 2);
        return item;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("/Users/hayashikoushi/IdeaProjects/algs4-data/tobe.txt");
            System.setIn(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ResizeStack<String> s;
        s = new ResizeStack<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
            StdOut.println(s.size());
        }
        StdOut.println("(" + s.size() + " left on stack");
    }
}

