import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_6 {
    // 打印斐波那契数列的前 15 项
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i<= 15; i++) {
            StdOut.println(f);
            f = f + g; // f 为 前两项和
            g = f - g; // g 为当前 f 的前 1 项
        }
    }
}
