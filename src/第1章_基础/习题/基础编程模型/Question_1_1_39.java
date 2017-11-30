import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Question_1_1_39 {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int[] generateArray(int N) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) array[i] = StdRandom.uniform(100000, 999999) ;
        return array;
    }

    public static int experiment(int[] array1, int[] array2) {
        int num = 0;
        for (int i = 0; i < array1.length; i++) {
            if (rank(array1[i], array2) >= 0) num++;
        }
        return num;
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int result1 = 0;
        for (int i = 1; i <= T; i++) result1 += experiment(generateArray(1000), generateArray(1000));
        int result2 = 0;
        for (int i = 1; i <= T; i++) result2 += experiment(generateArray(10000), generateArray(10000));
        int result3 = 0;
        for (int i = 1; i <= T; i++) result3 += experiment(generateArray(100000), generateArray(100000));
        int result4 = 0;
        for (int i = 1; i <= T; i++)
            result4 += experiment(generateArray(1000000), generateArray(1000000));
        StdOut.println(result1 / T);
        StdOut.println(result2 / T);
        StdOut.println(result3 / T);
        StdOut.println(result4 / T);
    }
}
