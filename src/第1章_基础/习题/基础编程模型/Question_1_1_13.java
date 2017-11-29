import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.lang.reflect.Method;

public class Question_1_1_13 {
    public static void main(String[] args) {
        Double[][] matrix = new Double[5][5];
        StdOut.println("Before Reverse:");
        // 使用 StdRandom 随机产生测试数组
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = StdRandom.uniform(1.0, 100.0);
                StdOut.printf("%.1f ", matrix[i][j]);
            }
            StdOut.println();
        }
        StdOut.println("After Reverse");
        Double[][] newmatrix = Question_1_1_13.<Double>reverseMatrix(matrix);
        for (int i = 0; i < newmatrix.length; i++) {
            for (int j = 0; j < newmatrix[i].length; j++) {
                StdOut.printf("%.1f ", newmatrix[i][j]);
            }
            StdOut.println();
        }
    }

    // 采用泛型类解决处理多种类型数组的问题
    // 遍历每一行，与相应的列交换，下一行从第 i 的元素开始遍历
    public static <T> T[][] reverseMatrix(T[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                T temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
