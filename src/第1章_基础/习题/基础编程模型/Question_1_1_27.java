import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_27 {
    public static double binomial(int N, int k, double p) {
        double[][] array = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                array[i][j] = -1;
            }
        }
        return binomial(array, N, k, p);
    }

    public static double binomial(double[][] array, int N, int k, double p) {
        if (N == 0 && k == 0) array[N][k] = 1.0;
        if (N < 0 || k < 0) return 0;
        if (array[N][k] == -1) {
            array[N][k] = (1.0 - p) * binomial(array, N - 1, k, p) + p * binomial(array, N - 1, k - 1, p);
        }
        return array[N][k];
    }

    public static void main(String[] args) {
        int N = 100;
        int k = 50;
        double p = 0.5;
        double result = binomial(N, k, p);
        StdOut.println(result);
    }

}
