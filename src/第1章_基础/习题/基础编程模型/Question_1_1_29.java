import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_29 {
    public static int rank(int key, int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < key) result++;
        }
        return result;
    }

    public static int count(int key, int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        int i = rank(16, whitelist);
        int j = count(16, whitelist);
        StdOut.println(i);
        StdOut.println(j);
    }
}
