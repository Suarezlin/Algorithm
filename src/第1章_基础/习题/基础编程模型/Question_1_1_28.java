import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Question_1_1_28 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        for (int element : whitelist) StdOut.println(element);
        StdOut.println();
        for (int i = 0; i < whitelist.length; i++) {
            for (int j = i + 1; j < whitelist.length; j++) {
                if (whitelist[i] == whitelist[j]) remove(j, whitelist);
            }
        }
        for (int element : whitelist) StdOut.println(element);
    }

    public static void remove(int index, int[] array) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }
}
