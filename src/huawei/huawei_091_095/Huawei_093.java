package huawei.huawei_091_095;

import java.util.Scanner;

/**
 * 201301 JAVA题目0-1级
 */
public class Huawei_093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int sum3 = 0;
            int sum5 = 0;
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                int num = sc.nextInt();
                if (num % 3 == 0) sum3 += num;
                else if (num % 5 == 0) sum5 += num;
                else a[count++] = num;
            }

            System.out.println(isExists(0, a, count, sum3, sum5));
        }

        sc.close();
    }

    public static boolean isExists(int index, int a[], int count, int sum3, int sum5) {
        if (index == count) return sum3 == sum5;
        return isExists(index + 1, a, count, sum3 + a[index], sum5) ||
                isExists(index + 1, a, count, sum3, sum5 + a[index]);
    }
}
