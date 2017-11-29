import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        // 数组值为：[9 8 7 6 5 4 3 2 1 0]
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        // 数组值变化，a[0] = a[9], a[1] = a[8] ... a[9] = a[0]
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(a[i]);
        }
    }
}
