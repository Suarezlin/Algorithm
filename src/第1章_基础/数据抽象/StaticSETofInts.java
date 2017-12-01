import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class StaticSETofInts {
    private int[] array;

    public StaticSETofInts(int[] a) {
        array = new int[a.length];
        for (int i = 0; i < a.length; i++) array[i] = a[i];
        Arrays.sort(array);
    }

    public int rank(int key) {
        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < array[mid]) hi = mid - 1;
            else if (key > array[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public boolean contains(int key) {
        if (rank(key) < 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("/Users/hayashikoushi/IdeaProjects/algs4-data/tinyT.txt");
            System.setIn(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        In in = new In(args[0]);
        int[] w = in.readAllInts();
        StaticSETofInts set = new StaticSETofInts(w);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (!set.contains(key)) StdOut.println(key);
        }
    }
}
