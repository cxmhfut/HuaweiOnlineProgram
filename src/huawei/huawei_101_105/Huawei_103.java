package huawei.huawei_101_105;

import java.util.Scanner;

/**
 * Redraiment的走法
 */
public class Huawei_103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(maxInc(a));
        }

        sc.close();
    }

    // 2 5 1 5 4 5
    // 1 2 1 2 2 3

    /**
     * 求一个数组的最长递增子序列长度 inc[n]
     * 1 inc[0] = 1
     * for i~n-1:
     * arr[i]>arr[j] && inc[j]+1>inc[i]
     * inc[i] = inc[j]+1
     *
     * @param arr
     * @return
     */
    public static int maxInc(int[] arr) {
        int inc[] = new int[arr.length];

        inc[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            inc[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && inc[j] + 1 > inc[i]) {
                    inc[i] = inc[j] + 1;
                }
            }
        }

        int res = 0;
        for (int i : inc) {
            if (res < i) res = i;
        }

        return res;
    }
}
