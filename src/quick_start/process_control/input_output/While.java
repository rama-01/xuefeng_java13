package quick_start.process_control.input_output;

public class While {
    public static void main(String[] args) {
        int m = 10;
        int n = 100;
        int sum = 0;
        // 先判断再循环
        // while (m <= n) {
        //     sum += m;
        //     m++;
        // }
        // System.out.println(sum);
        // 使用do while语句
        do {
            sum += m;
            m++;
        }while (m <= n);
        System.out.println(sum);
    }
}