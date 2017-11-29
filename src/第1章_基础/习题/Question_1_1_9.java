import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_9 {
    public static void main(String[] args) {
        // 采用除二取余法转化十进制数为二进制数
        int N = Integer.parseInt(args[0]);
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        StdOut.println(s);
    }
}
