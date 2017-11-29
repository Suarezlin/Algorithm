import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_21 {
    public static void main(String[] args) {
        while(!StdIn.isEmpty()) {
            String input = StdIn.readLine();
            String name = input.split(" ")[0];
            int num1 = Integer.parseInt(input.split(" ")[1]);
            int num2 = Integer.parseInt(input.split(" ")[2]);
            StdOut.printf("%s %d %d %.3f\n", name, num1, num2, (double)(num1) / num2);
        }
    }
}
