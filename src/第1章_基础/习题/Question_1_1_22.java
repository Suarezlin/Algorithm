import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Question_1_1_22 {
    public static int rank(int key, int[] array) {
        int lo = 0;
        int hi = array.length - 1;
        int mid = lo + (hi - lo) / 2;
        int deep = 0;
        return rank(key, array, lo, hi, mid, deep);
    }

    public static int rank(int key, int[] array, int lo, int hi, int mid, int deep) {
        deep++;
        String indent = "";
        for (int i = 1; i <= deep; i++) indent += " ";
        StdOut.printf(indent + "%d %d %d \n", lo, mid, hi);
        if (lo <= hi) {
            if (key == array[mid]) return mid;
            else if (key > array[mid]) return rank(key, array, mid + 1, hi, mid + 1 + (hi - mid - 1) / 2, deep);
            else if (key < array[mid]) return rank(key, array, lo, mid - 1, lo + (mid - 1 - lo) / 2, deep);
        }
        return -1;
    }

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("/Users/hayashikoushi/IdeaProjects/algs4-data/tinyT.txt");
            System.setIn(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }
}
