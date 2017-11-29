import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Question_1_1_15 {
    public static void main(String[] args) {
        int[] array = new int[10];
        // 随机产生测试数组
        for (int i = 0; i < array.length; i++) {
            array[i] = StdRandom.uniform(0, 10);
            StdOut.printf("%d ", array[i]);
        }
        StdOut.println();
        // 调用静态方法 histogram
        int[] result = Question_1_1_15.histogram(array, 12);
        for (int i = 0; i < result.length; i++) StdOut.printf("%d ", result[i]);
        StdOut.println();
    }

    public static int[] histogram(int[] array, int M) {
        int[] result = new int[M];
        // 循环输入的数组，若值在 0 到 M-1 之间则 result 数组中 对应的一项自增
        for (int i = 0; i < array.length; i++) {
            if (array[i] < M - 1 && array[i] >= 0) {
                result[array[i]]++;
            }
        }
        return result;
    }
}
