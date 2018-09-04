package huawei.huawei_091_095;

import java.util.Scanner;

/**
 * 201301 JAVA 题目2-3级
 */
public class Huawei_091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(pathDp2(m, n));
        }

        sc.close();
    }

    /**
     * 计右下角为原点
     * 向右走一步 n-1
     * 向下走一步 m-1
     * 当触碰到边界后只有一种走法
     * (m,n)->(0,0) -- 向下走一步path(m-1,n),向右走一步(m,n-1)
     *
     * @param m
     * @param n
     * @return
     */
    public static int path(int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }

        return path(m - 1, n) + path(m, n - 1);
    }

    public static int pathDp1(int m, int n) {
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m][n];
    }

    public static int pathDp2(int m, int n) {
        int dp[] = new int[n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[j] = 1;
                } else {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
        }

        return dp[n];
    }
}
