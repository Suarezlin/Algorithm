import edu.princeton.cs.algs4.StdOut;

public class Question_1_1_3 {
    public static void main(String[] args) {
        // 通过 args 获取命令行参数并比较
        // 比较时要通过 Integer.parseInt 方法将参数由字符串转换为整数
        // Java 中字符串均为一个实例的引用，直接比较两个字符串是否相等无法得到想要的结果
        if (Integer.parseInt(args[0]) == Integer.parseInt(args[1]) && Integer.parseInt(args[1]) == Integer.parseInt(args[2])) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }
}
