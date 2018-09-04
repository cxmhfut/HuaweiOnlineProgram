package huawei.huawei_106_108;

import java.util.Scanner;

/**
 * 求最小公倍数
 */
public class Huawei_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a * b / gcd(a, b));
        }

        sc.close();
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }
            a = a % b;
        }

        return b;
    }
}
