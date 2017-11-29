import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_1 {
    public static void main(String[] args) {
        // 0 和 15 均为 int，相加后还是 int，除以 2 后仍为 int 所以结果为 7
        StdOut.println((0 + 15) / 2);
        // 两浮点数相乘，结果为：200.0000002
        StdOut.println(2.0e-6 * 100000000.1);
        // true 和 false 与之后为 false，与 true 或后为 true，再与 ture 与，结果为 ture
        StdOut.println(true && false || true && true);
    }
}
