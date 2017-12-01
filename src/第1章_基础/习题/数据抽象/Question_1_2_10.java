import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Question_1_2_10 {
    private int N;
    private int max;
    private int operation;
    private int count;

    public Question_1_2_10(int N, int max) {
        this.N = N;
        this.max = max;
        this.operation = 0;
        this.count = 0;
    }

    private void draw() {
        StdDraw.clear();
        StdDraw.setXscale(0, 10);
        StdDraw.setYscale(0, 10);
        StdDraw.setPenRadius(0.01);
        for (int i = 1; i <= max; i++) {
            if ((i % 5) != 0 && (i / 25) != 1) {
                int x = 2 * (i % 5) - 1;
                int y = 2 * ((i - 1) / 5 + 1) - 1;
                StdDraw.rectangle(x, y, 0.5, 0.5);
            }
            else if ((i % 5) == 0 && (i / 25) != 1) {
                int x = 9;
                int y = 2 * ((i - 1) / 5 + 1) - 1;
                StdDraw.rectangle(x, y, 0.5, 0.5);
            }
            else if ((i % 5) != 0 && (i / 25) == 1) {
                int x = 2 * (i % 5) - 1;
                int y = 9;
                StdDraw.rectangle(x, y, 0.5, 0.5);
            }
            else {
                int x = 9;
                int y = 9;
                StdDraw.rectangle(x, y, 0.5, 0.5);
            }
        }
        for (int i = 1; i <= count; i++) {
            if ((i % 5) != 0 && (i / 25) != 1) {
                int x = 2 * (i % 5) - 1;
                int y = 2 * ((i - 1) / 5 + 1) - 1;
                StdDraw.filledRectangle(x, y, 0.5, 0.5);
            }
            else if ((i % 5) == 0 && (i / 25) != 1) {
                int x = 9;
                int y = 2 * ((i - 1) / 5 + 1) - 1;
                StdDraw.filledRectangle(x, y, 0.5, 0.5);
            }
            else if ((i % 5) != 0 && (i / 25) == 1) {
                int x = 2 * (i % 5) - 1;
                int y = 9;
                StdDraw.filledRectangle(x, y, 0.5, 0.5);
            }
            else {
                int x = 9;
                int y = 9;
                StdDraw.filledRectangle(x, y, 0.5, 0.5);
            }
        }
        StdDraw.show(500);
    }

    public void increase() {
        if (operation < N && count < max) {
            count++;
        }
        draw();
    }

    public void decrease() {
        if (operation < N && Math.abs(count) < max) {
            count--;
        }
        draw();
    }

    public static void main(String[] args) {
        Question_1_2_10 q = new Question_1_2_10(100, 25);
        q.increase();
        q.increase();
        q.decrease();
    }
}
