package quick_start.process_control.input_output;

public class Switch {
    public static void main(String[] args) {
       /* int option = 2;
        switch (option) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                // break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
            default:
                System.out.println("unknown option");*/
        // 新语法
        /*int option = 2;
        int o = switch (option) {
            case 1 -> 1;
            case 2 -> 2;
            default -> {
                int x = 100;
                yield x;
            }
        };
        System.out.println(o);*/
    }
}