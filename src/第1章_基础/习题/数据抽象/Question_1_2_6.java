import edu.princeton.cs.algs4.StdOut;

public class Question_1_2_6 {
    public static String circularRotate(String s, int k) {
        String head = s.substring(0, k);
        String tail = s.substring(k, s.length());
        return tail + head;
    }

    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "TGACGAC";
        for (int i = 1; i <= s.length(); i++) {
            if (circularRotate(s, i).equals(t)) {
                StdOut.println("是回环变位");
                break;
            }
            if (i == s.length()) StdOut.println("不是回环变位");
        }
    }
}
