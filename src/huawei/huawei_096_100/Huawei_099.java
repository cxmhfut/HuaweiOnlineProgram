package huawei.huawei_096_100;

import java.util.Scanner;

/**
 * 自守数
 */
public class Huawei_099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            calcAutomorphicNumbers(n);
        }

        sc.close();
    }

    public static void calcAutomorphicNumbers(int n) {
        int count = 0;
        int i = 0;
        while (i <= n) {
            if (isAutomorphicNumber(i)) {
                count++;
            }
            i++;
        }

        System.out.println(count);
    }

    public static boolean isAutomorphicNumber(int n) {
        return String.valueOf(n * n).endsWith(String.valueOf(n));
    }
}
