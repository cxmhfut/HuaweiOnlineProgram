package huawei.huawei_086_090;

import java.util.Scanner;

/**
 *求最大连续bit数
 */
public class Huawei_086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            getMaxBit(n);
        }

        sc.close();
    }

    public static void getMaxBit(int n) {
        StringBuilder buf = new StringBuilder();
        while (n != 0) {
            buf.append(n % 2);
            n /= 2;
        }

        int max = 0;
        String pattern = "1";
        String bufN = buf.toString();
        for (int i = 0; i < bufN.length(); i++) {
            if (bufN.contains(pattern)) {
                max++;
            }
            pattern += "1";
        }

        System.out.println(max);
    }
}
