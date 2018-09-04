package huawei.huawei_061_065;

import java.util.Scanner;

/**
 * 放苹果
 */
public class Huawei_061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(apple(m, n));
        }

        sc.close();
    }

    /**
     * 将m个苹果放到n个盘子中
     * 1) m<n,总会多出n-m个盘子，这时放置的总数和只有m个盘子的效果相同
     * 2) m>=n
     * a) 不存在空盘子，将所有放置苹果的盘子拿掉一个苹果不影响不同放法的总数 apple(m-n,n)
     * b) 存在至少一个空盘子， apple(m,n-1)
     * apple(m,n) = apple(m,n-1) + apple(m-n,n)
     *
     * @param m
     * @param n
     * @return
     */
    public static int apple(int m, int n) {
        if (m == 0 || n == 1) {
            return 1;
        }
        if (m < n) {
            return apple(m, m);
        }

        //m>=n
        return apple(m, n - 1) + apple(m - n, n);
    }
}
