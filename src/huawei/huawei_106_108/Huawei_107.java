package huawei.huawei_106_108;

import java.util.Scanner;

/**
 * 求解立方根
 */
public class Huawei_107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double input = sc.nextDouble();
            System.out.println(String.format("%.1f", getCubeRoot(input)));
        }

        sc.close();
    }

    /**
     * f(x) = x^3 - y
     * 牛顿迭代法 x_n+1 = x_n - f(x)/f'(x)
     *
     * @param input
     * @return
     */
    public static double getCubeRoot(double input) {
        double x = 1.0;
        while (Math.abs(x * x * x - input) > 1e-7) {
            x = (2 * x * x * x + input) / (3 * x * x);
        }
        return x;
    }
}
