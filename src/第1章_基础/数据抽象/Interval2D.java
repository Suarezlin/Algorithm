import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import 第1章_基础.数据抽象.Interval1D1;
import 第1章_基础.数据抽象.Point2D1;

public class Interval2D {
    private Interval1D1 x;
    private Interval1D1 y;

    public Interval2D(Interval1D1 a, Interval1D1 b) {
        x = a;
        y = b;
    }

    public double area() {
        return x.length() * y.length();
    }

    public boolean contains(Point2D1 point) {
        if (x.contains(point.x()) && y.contains(point.y())) return true;
        else return false;
    }

    public boolean intersect(Interval2D that) {
        if (x.intersect(that.x) && y.intersect(that.y)) return true;
        else return false;
    }

    public void draw() {
        StdDraw.setXscale(x.lo() - 2*x.length(), x.hi() + 2*x.length());
        StdDraw.setYscale(y.lo() - 2*y.length(), y.hi() + 2*y.length());
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(x.lo(), y.lo(), x.hi(), y.lo());
        StdDraw.line(x.lo(), y.lo(), x.lo(), y.hi());
        StdDraw.line(x.lo(), y.hi(), x.hi(), y.hi());
        StdDraw.line(x.hi(), y.lo(), x.hi(), y.hi());
    }

    public static void main(String[] args) {
        Interval1D1 x = new Interval1D1(1.0, 5.0);
        Interval1D1 y = new Interval1D1(2.0, 4.0);
        Interval2D interval = new Interval2D(x, y);
        StdOut.println(interval.area());
        StdOut.println(interval.contains(new Point2D1(2.0, 3.0)));
        StdOut.println(interval.intersect(new Interval2D(new Interval1D1(-1.0,0.0), new Interval1D1(3.0, 4.0))));
        interval.draw();
    }
}
