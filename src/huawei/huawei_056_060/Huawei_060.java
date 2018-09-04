package huawei.huawei_056_060;

import java.util.Scanner;

/**
 * 查找组成一个偶数最接近的两个素数
 */
public class Huawei_060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            getMinPrime(n);
        }

        sc.close();
    }

    public static void getMinPrime(int n) {

        for (int i = n / 2; i >= 2; i--) {
            if (isPrime(i) && isPrime(n-i)) {
                System.out.println(i);
                System.out.println(n-i);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
