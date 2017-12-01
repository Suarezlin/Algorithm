import edu.princeton.cs.algs4.StdOut;

public class Question_1_2_7 {
    public static String mystery(String s) {
        // 返回值为字符串 s 的倒置
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        StdOut.println(mystery("abcdefg"));
    }
}
