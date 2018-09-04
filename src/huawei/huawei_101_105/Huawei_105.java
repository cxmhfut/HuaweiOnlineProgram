package huawei.huawei_101_105;

import java.util.Scanner;

/**
 * 记负均正II
 */
public class Huawei_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int neg = 0;
        int pos = 0;
        int sum = 0;

        while (sc.hasNext()) {
            int a = sc.nextInt();
            if (a < 0) neg++;
            else {
                sum += a;
                pos++;
            }
        }

        System.out.println(neg);
        if(pos==0) System.out.println("0.0");
        else System.out.println(String.format("%.1f", (double) sum / pos));

        sc.close();
    }
}
