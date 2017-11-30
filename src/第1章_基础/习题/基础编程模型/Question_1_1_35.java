import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import javafx.geometry.Side;

public class Question_1_1_35 {
    public static double[] getExactValue(int Sides) {
        double[] dist = new double[2 * Sides + 1];
        for (int i = 1; i <= Sides; i++) {
            for (int j = 1; j <= Sides; j++) {
                dist[i + j] += 1.0;
            }
        }
        for (int k = 2; k <= 2*Sides; k++) {
            dist[k] /= 36.0;
        }
        return dist;
    }

    public static double[] getApproximateValue(int Sides) {
        double[] dist = new double[2 * Sides + 1];
        for (int i = 1; i <= 200000; i++) {
            dist[rollDice(Sides)] += 1.0;
        }
        for (int i = 0; i <= 2*Sides; i++) dist[i] /= 200000;
        return dist;
    }

    public static int rollDice(int sides) {
        return StdRandom.uniform(1, sides + 1) + StdRandom.uniform(1, sides + 1);
    }

    public static void main(String[] args) {
        double[] dist_1 = getExactValue(6);
        double[] dist_2 = getApproximateValue(6);
        for (int i = 0; i <= 12; i++) {
            StdOut.printf("%.3f %.3f\n", dist_1[i], dist_2[i]);
        }
    }
}
