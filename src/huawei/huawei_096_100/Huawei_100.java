package huawei.huawei_096_100;

import java.util.Scanner;

/**
 * 等差数列
 */
public class Huawei_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int result = (3 * n + 1) * n / 2;
            System.out.println(result);
        }

        sc.close();
    }
}
