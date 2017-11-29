import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_33 {
    public static double dot(double[] x, double[] y) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i] * y[i];
        }
        return result;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                double[] temp = new double[a.length];
                for (int k = 0; k < a.length; k++) {
                    temp[k] = b[k][j];
                }
                result[i][j] = dot(a[i], temp);
            }
        }
        return result;
    }

    public static double[][] transpose(double[][] a) {
        double[][] result = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                result[i][j] = a[j][i];
                result[j][i] = a[i][j];
            }
        }
        return result;
    }

    public static double[] mult(double[][] a, double[] x) {
        double[] result = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            result[i] = dot(a[i], x);
        }
        return result;
    }

    public static double[] mult(double[] y, double[][] a) {
        double[] result = new double[y.length];
        for (int i = 0; i < y.length; i++) {
            double[] temp = new double[y.length];
            for (int j = 0; j < y.length; j++) {
                temp[j] = a[j][i];
            }
            result[i] = dot(y, temp);
        }
        return result;
    }

    public static void display(double[] a) {
        for (int i = 0; i < a.length; i++) StdOut.printf("%.2f ", a[i]);
        StdOut.println();
    }

    public static void display(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                StdOut.printf("%.2f ", a[i][j]);
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        double[] pointer_1 = {1, 2, 3, 4, 5};
        double[] pointer_2 = {2, 3, 4, 5, 6};
        double[][] matrix_1 = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}, {3, 4, 5, 6, 7}, {4, 5, 6, 7, 8}, {5, 6, 7, 8, 9}};
        double[][] matrix_2 = {{2, 3, 4, 5, 6}, {3, 4, 5, 6, 7}, {4, 5, 6, 7, 8}, {5, 6, 7, 8, 9}, {6, 7, 8, 9, 0}};
        StdOut.println(dot(pointer_1, pointer_2));
        StdOut.println();
        display(mult(matrix_1, matrix_2));
        StdOut.println();
        display(transpose(matrix_1));
        StdOut.println();
        display(mult(matrix_1, pointer_2));
        StdOut.println();
        display(mult(pointer_1, matrix_1));
    }
}
