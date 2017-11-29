import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Question_1_1_31 {
    public static void main(String[] args) {
        int N  = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        StdDraw.setXscale(-20, 20);
        StdDraw.setYscale(-20, 20);
        StdDraw.setPenRadius(0.001);
        StdDraw.circle(0, 0, 10);
        StdDraw.setPenRadius(0.005);
        double[] x = new double[N];
        double[] y = new double[N];
        double angle = (360.0 / N) * Math.PI / 180.0;
        for (int i = 0; i < N; i++) {
            x[i] = 10 * Math.cos(angle * i);
            y[i] = 10 * Math.sin(angle * i);
            StdDraw.point(x[i], y[i]);
        }
        StdDraw.setPenColor(Color.gray);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    double f = StdRandom.uniform(1.0, 10.0);
                    if (f < 10.0 * p) StdDraw.line(x[i], y[i], x[j], y[j]);
                }
            }
        }
    }
}
