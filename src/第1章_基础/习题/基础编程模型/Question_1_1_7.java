import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_7 {
    public static void main(String[] args) {
        // 循环终止条件为 t- 9/0/t = 0，所以结果为：3
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > 0.001) t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
        // 第二层循环执行次数为 i 的值，计算 1 + 2 + 3 + ... + 999 的值为：499500
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
        // i 每次增大两倍，计算 1 + 2 + 4 + ... + 998 的值
        int sum1 = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum1 ++;
            }
        }
        StdOut.println(sum1);
    }
}
