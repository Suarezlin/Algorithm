import edu.princeton.cs.algs4.StdOut;

public class Question_1_2_17 {
    public static void main(String[] args) {
        newRational a = new newRational(2147483647, 400);
        newRational b = new newRational(300, 600);
        StdOut.println(a.toString());
        StdOut.println(b.toString());
        StdOut.println(a.plus(b).toString());
        StdOut.println(a.minus(b).toString());
        StdOut.println(a.times(b).toString());
        StdOut.println(a.divides(b).toString());
        StdOut.println(a.equals(b));
    }
}

class newRational {
    private final int numerator;
    private final int denominator;

    public newRational(long numerator, long denominator) {
        assert numerator > 2147483647 : "rational number overflow";
        assert numerator < -2147483648 : "rational number overflow";
        int numerator1 = (int)numerator;
        int denominator1 = (int)denominator;
        if (gcd(numerator1, denominator1) == 1) {
            this.numerator = numerator1;
            this.denominator = denominator1;
        }
        else {
            this.numerator = numerator1 / gcd(numerator1, denominator1);
            this.denominator = denominator1 / gcd(numerator1, denominator1);
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return gcd(b, c);
    }

    public newRational plus (newRational b) {
        return new newRational(numerator * b.denominator + denominator * b.numerator, denominator * b.numerator);
    }

    public newRational minus(newRational b) {
        return new newRational(numerator * b.denominator - denominator * b.numerator, denominator * b.numerator);
    }

    public newRational times(newRational b) {
        return new newRational(numerator * b.numerator, denominator * b.denominator);
    }

    public newRational divides(newRational b) {
        return new newRational(numerator * b.denominator, denominator * b.numerator);
    }

    public boolean equals(newRational that) {
        if (that == null) return false;
        if (this == that) return true;
        if (numerator != that.numerator) return false;
        if (denominator != that.denominator) return false;
        return true;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
