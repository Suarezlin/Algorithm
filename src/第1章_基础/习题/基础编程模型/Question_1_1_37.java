import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Question_1_1_37 {
    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(0,N-1);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[Integer.parseInt(args[0])];
        int[][] result = new int[Integer.parseInt(args[0])][Integer.parseInt(args[0])];
        for (int i = 0; i < Integer.parseInt(args[1]); i++) {
            for (int j = 0; j < array.length; j++) array[j] = j;
            shuffle(array);
            for (int j = 0; j < array.length; j++) {
                result[array[j]][j] ++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                StdOut.printf("%d ", result[i][j]);
            }
            StdOut.println();
        }
    }
}
