import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Interval1D {
    private double lo;
    private double hi;

    public Interval1D(double a, double b) {
        lo = a;
        hi = b;
    }

    public double lo() {
        return lo;
    }

    public double hi() {
        return hi;
    }

    public double length() {
        return hi - lo;
    }

    public boolean contains(double x) {
        if ((lo <= x) && (x < hi)) return true;
        else return false;
    }

    public boolean intersect (Interval1D that) {
        if (!(lo > that.hi) || !(hi < that.lo)) return true;
        else return false;
    }

    public void draw() {
        StdDraw.setXscale(lo - 2*length(), hi + 2*length());
        StdDraw.setYscale(-2, 2);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(lo, 0.0, hi, 0.0);
    }

    public static void main(String[] args) {
        Interval1D interval = new Interval1D(1.0, 3.0);
        StdOut.println(interval.length());
        StdOut.println(interval.contains(2.0));
        StdOut.println(interval.intersect(new Interval1D(2.0, 3.0)));
        interval.draw();
    }
}
