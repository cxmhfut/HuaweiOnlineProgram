package huawei.huawei_056_060;

import java.util.Scanner;

/**
 * iNOC产品部-完全数计算
 */
public class Huawei_056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int count = 0;
            for (int i = 6; i <= N; i++) {
                if (perfectNumber(i)) count++;
            }
            System.out.println(count);
        }

        sc.close();
    }

    public static boolean perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }
}
