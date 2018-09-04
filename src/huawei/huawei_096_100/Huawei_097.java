package huawei.huawei_096_100;

import java.util.Scanner;

/**
 * 记负均正
 */
public class Huawei_097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            counter(arr);
        }

        sc.close();
    }

    public static void counter(int arr[]) {
        int sum = 0;
        int count_positive = 0;
        int count_negative = 0;

        for (int a : arr) {
            if (a > 0) {
                sum += a;
                count_positive++;
            } else if (a < 0) {
                count_negative++;
            }
        }

        System.out.println(String.format("%d %.1f", count_negative, (double) sum / count_positive));
    }
}
