import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_30 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[][] array = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (isCoprime(i, j)) array[i][j] = true;
                else array[i][j] = false;
                StdOut.printf("%b ", array[i][j]);
            }
            StdOut.println();
        }
    }

    public static boolean isCoprime(int a, int b) {
        int i = gcd(a, b);
        if (i == 1) return true;
        else return false;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return gcd(b, c);
    }
}
