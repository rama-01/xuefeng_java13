package quick_start.list_manipulation;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] ns = {4, 3, 2, 5, 1};
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j + 1] < ns[j]) {
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }
        }
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        // System.out.println(Arrays.toString(ns));
        int[][] multiple = {
                {1, 2, 3, 4},
                {5, 6, 7, 8,},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.deepToString(multiple));
    }
}