import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Question_1_1_32 {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("/Users/hayashikoushi/IdeaProjects/Algorithm/src/第1章_基础/习题/基础编程模型/Question_1_1_32.txt");
            System.setIn(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int N = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);
        double step = Math.abs(l - r) / N;
        int[] num = new int[N];
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            for (int i = 0; i < N; i++) {
                if (step * i <= value && value < step * (i + 1))
                    num[i]++;
            }
        }
        StdDraw.setXscale(-0.5, 1.5);
        StdDraw.setYscale(0, 5);
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = num[i] / 2.0;
            double rw = 0.4 / N;
            double rh = num[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
