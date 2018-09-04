package huawei.huawei_021_025;

import java.util.Scanner;

/**
 * 汽水瓶
 */
public class Huawei_022 {

    static int results[] = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n != 0)
                System.out.println(getResult(n));
        }

        sc.close();
    }

    //经数学分析最终结果为n/2
    public static int getResult(int n) {
        if (results[n] != 0)
            return results[n];

        if (n == 0 || n == 1)
            return 0;

        if (n == 2 || n == 3)
            return 1;

        int x = n / 3;//获得的新的汽水的瓶数
        int y = n % 3;//剩余空瓶数

        results[n] = x + getResult(x + y);

        return results[n];
    }
}
