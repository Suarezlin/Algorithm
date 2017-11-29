import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_14 {

    public static void main(String[] args) {
        int n = Question_1_1_14.getLog(5);
        StdOut.println(n);
    }

    public static int getLog(int N) {
        int n = 0;
        int value = 1;
        // 循环遍历 n ，终止条件 2^n <= N 及 n <= log2(N)
        while (value <= N) {
            n++;
            value = 1;
            // 循环计算 2^n
            for (int i = 1; i <= n; i++) {
                value *= 2;
            }
        }
        return --n;
    }
}
