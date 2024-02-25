package quick_start.process_control.input_output;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        // System.out.println(sum);
        int[] ns = {1, 4, 9, 16, 25};
        for (int n : ns) {
            System.out.println(n);
        }
    }
}