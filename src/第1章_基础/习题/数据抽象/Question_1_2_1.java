import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;

public class Question_1_2_1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] point = new Point2D[N];
        StdDraw.setXscale(-1.0, 2.0);
        StdDraw.setYscale(-1.0, 2.0);
        new Interval2D(new Interval1D(0.0, 1.0), new Interval1D(0.0, 1.0)).draw();
        for (int i = 0; i < N; i++) {
            point[i] = new Point2D(StdRandom.uniform(0.0, 1.0), StdRandom.uniform(0.0, 1.0));
            point[i].draw();
        }
        StdDraw.setPenRadius(0.05);
        double distance = 100.0;
        for(int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (point[i].distanceTo(point[j]) < distance) distance = point[i].distanceTo(point[j]);
            }
        }
        StdOut.println(distance);
    }
}
