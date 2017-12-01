import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Question_1_2_2 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] interval1d = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            interval1d[i] = new Interval1D(StdRandom.uniform(0.0, 10.0), StdRandom.uniform(10.0, 20.0));
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (interval1d[i].intersects(interval1d[j])) StdOut.printf("%d %d\n", i, j);
            }
        }
    }
}
