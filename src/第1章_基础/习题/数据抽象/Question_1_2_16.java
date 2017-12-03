import edu.princeton.cs.algs4.StdOut;

public class Question_1_2_16 {
    public static void main(String[] args) {
        Rational a = new Rational(200, 400);
        Rational b = new Rational(300, 600);
        StdOut.println(a.toString());
        StdOut.println(b.toString());
        StdOut.println(a.plus(b).toString());
        StdOut.println(a.minus(b).toString());
        StdOut.println(a.times(b).toString());
        StdOut.println(a.divides(b).toString());
        StdOut.println(a.equals(b));
    }
}

class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        if (gcd(numerator, denominator) == 1) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        else {
            this.numerator = numerator / gcd(numerator, denominator);
            this.denominator = denominator / gcd(numerator, denominator);
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return gcd(b, c);
    }

    public Rational plus (Rational b) {
        return new Rational(numerator * b.denominator + denominator * b.numerator, denominator * b.numerator);
    }

    public Rational minus(Rational b) {
        return new Rational(numerator * b.denominator - denominator * b.numerator, denominator * b.numerator);
    }

    public Rational times(Rational b) {
        return new Rational(numerator * b.numerator, denominator * b.denominator);
    }

    public Rational divides(Rational b) {
        return new Rational(numerator * b.denominator, denominator * b.numerator);
    }

    public boolean equals(Rational that) {
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
