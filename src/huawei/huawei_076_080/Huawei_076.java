package huawei.huawei_076_080;

import java.util.Scanner;

/**
 * 尼科彻斯定理
 */
public class Huawei_076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int m = sc.nextInt();
            getSeqOddNum(m);
        }

        sc.close();
    }

    /**
     * m^3 = x + (x+2) + ... +(x+2*(m-1)) = mx + m^2 -m
     * x = m^2-m+1
     *
     * @param m
     */
    public static void getSeqOddNum(int m) {
        int x = m * m - m + 1;
        for (int i = 0; i < m - 1; i++) {
            System.out.print(x + "+");
            x = x + 2;
        }
        System.out.println(x);
    }
}
