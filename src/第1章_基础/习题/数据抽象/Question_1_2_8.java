public class Question_1_2_8 {
    private String id;
    private int count;

    public Question_1_2_8(String s) {
        id = s;
        count = 0;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    public String toString() {
        return "Counter id: " + id + " count: " + String.valueOf(count);
    }


    public static void main(String[] args) {

    }
}
