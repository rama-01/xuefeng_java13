package quick_start.base_knowledge.variable;

public class Main {
    public static void main(String[] args) {
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        // 在Java中，对于整数类型的数据，最高位为1时表示负数。这是因为Java中使用的是补码表示法来表示负数。
        int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        n = 100;
        int sum = 0;
        while (n >= 1) {
            sum += n;
            n--;
        }
        System.out.println(sum);
        n = 5;
        double d1 = 1.2 + 24.0 / n;
        System.out.println(d1);
        double d2 = 1.2 + 24 / 5;
        System.out.println(d2);

        // 指针指向问题
        String s = "hello";
        String r = s;
        s = "world";
        System.out.println(r); //"hello"

        String[] names = {"abc", "xyz", "zoo"};
        String s1 = names[1];
        names[1] = "cat";
        System.out.println(s1); // "xyz
    }
}