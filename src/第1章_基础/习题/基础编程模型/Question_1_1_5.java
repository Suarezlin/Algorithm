import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_5 {
    public static void main(String[] args) {
        // 现将输入的参数转化为 Double 类型
        double paramentX = Double.parseDouble(args[0]);
        double paramentY = Double.parseDouble(args[1]);
        // 比较是否符合要求
        if ((paramentX > 0.0 && paramentX < 1.0) && (paramentY > 0.0 && paramentY < 1.0)) {
            StdOut.println("true");
        }
        else {
            StdOut.println("false");
        }
    }
}
