import edu.princeton.cs.algs4.StdRandom;

public class Question_1_1_34 {
    public static double[] getMaxAndMin(double[] a) {
        double[] result = new double[2];
        result[0] = 1;
        result[1] = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < result[0]) result[0] = a[i];
            if (a[i] > result[1]) result[1] = a[i];
        }
        return result;
    }

    public static double getMiddle(double[] a) {
        if (a.length % 2 == 0) {
            return (a[a.length / 2] + a[a.length / 2 - 1]) / 2;
        }
        else {
            return a[a.length / 2];
        }
    }

    public static void remove(int index, double[] a) {
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        double[] temp = new double[a.length - 1];
        for (int i = 0; i < temp.length; i++) temp[i] = a[i];
        a = temp;
    }
    public static double getKMin(int k, double[] a) {
        int c = 0;
        return getKMin(k, a, c);
    }
    public static double getKMin(int k, double[] a, int c) {
        double min = 1;
        int index = 0;
        for(int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        c++;
        if (c == k) return min;
        else {
            remove(index, a);
            return getKMin(k, a, c);
        }
    }

    public static double getSquareSum(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * a[i];
        }
        return sum;
    }

    public static double average(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static double getAverageRate(double[] a) {
        double average = average(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > average) count++;
        }
        return count / a.length;
    }

    public static double[] Ascending(double[] a) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) result[i] = a[i];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (result[i] > result[j]) {
                    double temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

//    public static double[] getRandomSort(double[] a) {
//        double[] result = new double[a.length];
//        for (int i = 0; i < a.length; i++) result[i] = a[i];
//        int count = 0;
//        int index;
//        while (count == a.length) {
//            index = StdRandom.uniform(0, a.length);
//        }
//    }
}
