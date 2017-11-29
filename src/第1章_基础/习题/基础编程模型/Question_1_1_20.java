import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_20 {
    public static double ln(int N) {
        double factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        double result = 0;
        // 采用泰勒展开：ln(x) = 2 * ((x-1)/(x+1) + ((x-1)/(x+1))^3 / 3 + ...)
        for (int i = 1; i <= 1000; i += 2) {
            double value = Math.pow((factorial - 1) / (factorial + 1), i) / i;
            result += value;
        }
        return 2 * result;
    }

    public static void main(String[] args) {
        StdOut.println(ln(3));
    }
}
