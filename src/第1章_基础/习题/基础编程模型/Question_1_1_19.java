import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_19 {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
    // 产生一个长为 N+1 的数组用来保存结果
    public static long newF(int N) {
        long[] result = new long[N + 1];
        return newF(result, N);
    }

    // 递归，并将结果保存在数组中
    public static long newF(long[] result, int N) {
        if (result[N] == 0) {
            if (N == 0) result[N] = 0;
            else if (N == 1) result[N] = 1;
            else if (N > 0) result[N] = newF(result, N - 1) + newF(result, N - 2);
        }
        return result[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + newF(N));
        }
    }
}
