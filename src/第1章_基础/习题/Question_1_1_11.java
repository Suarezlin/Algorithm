import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Question_1_1_11 {
    public static void main(String[] args) {
        Boolean[][] array = new Boolean[5][5];
        // 通过 StdRandom 设置布尔数组
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                double value = StdRandom.uniform(1,10);
                if (value < 5) array[i][j] = true;
                else array[i][j] = false;
            }
        }
        // 双重循环判断数组值
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i][j]) StdOut.print("* ");
                else StdOut.print("  ");
            }
            StdOut.println();
        }
    }
}
