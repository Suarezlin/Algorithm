import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;

public class Geometry {
    public static void main(String[] args) {
        Interval1D x = new Interval1D(1.0, 5.0);
        Interval1D y = new Interval1D(2.0, 4.0);
        Interval2D interval = new Interval2D(x, y);
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
        interval.draw();
    }
}

