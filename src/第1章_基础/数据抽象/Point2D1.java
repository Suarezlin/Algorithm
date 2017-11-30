package 第1章_基础.数据抽象;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;

public class Point2D1 {
    private double x;
    private double y;

    public Point2D1(double a, double b) {
        x = a;
        y = b;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double r() {
        return Math.sqrt(x * x + y * y);
    }

    public double theta() {
        return Math.atan(y / x);
    }

    public double distTo(Point2D1 that) {
        return Math.sqrt((x - that.x) * (x - that.x) + (y - that.y) * (y - that.y));
    }

    public void draw() {
        StdDraw.setXscale(x - 2 * x, x + 2 * x);
        StdDraw.setYscale(y - 2 * y, y + 2 * y);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(x, y);
    }

    public static void main(String[] args) {
        Point2D1 point = new Point2D1(1, 3);
        StdOut.print(point.x() + " " + point.y() + " " + point.r() + " " + point.theta() + " " + point.distTo(new Point2D1(1.0, 2.0)));
        point.draw();
    }
}
