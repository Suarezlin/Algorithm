import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Question_1_3_5 {
    public static void main(String[] args) {
        /*
        这段代码作用为转换十进制整数位二进制数
        转换方法：除二取余法
        N > 0 时 N 除以 2 的余数入栈， N 为 N 除以 2 的值
        最后出栈，完成转换。
         */
        Stack_1_3_5<Integer> stack = new Stack_1_3_5<Integer>();
        int N = 10;
        while (N > 0) {
            stack.push(N % 2);
            N = N / 2;
        }
        for (int d : stack) StdOut.print(d);
        StdOut.println();
    }
}

class Stack_1_3_5<Item> implements Iterable<Item> {
    private Item[] array;
    private int N;

    public Stack_1_3_5() {
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
}
