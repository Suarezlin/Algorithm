import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_24 {
    public static int gcd(int a, int b) {
        StdOut.printf("%d %d \n", a, b);
        if (b == 0) return a;
        int c = a % b;
        return gcd(b, c);
    }

    public static void main(String[] args) {
        StdOut.println(gcd(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}
