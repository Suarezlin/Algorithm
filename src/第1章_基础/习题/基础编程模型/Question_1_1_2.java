import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_2 {
    public static void main(String[] args) {
        // 1 与 2.236 相加，结果为浮点数 3.236 除以 2 结果为：1.618
        StdOut.println((1 + 2.236) / 2);
        // 整数与浮点数相加结果为浮点数：10.0
        StdOut.println(1 + 2 + 3 + 4.0);
        // 4.1 大于 4 结果为：true
        StdOut.println(4.1 >= 4);
        // 1 和 2 相加为 3，3与字符串 "3" 相加，结果为："33"
        // 注：双引号括起来是字符串，单引号是字符，若此题为单引号则结果为：1 + 2 + 3的编码值 = 54
        StdOut.println(1 + 2 + "3");
        StdOut.println(1 + 2 + '3');
    }
}
