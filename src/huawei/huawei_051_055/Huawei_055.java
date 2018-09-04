package huawei.huawei_051_055;

import java.util.Scanner;

/**
 * 练习用(挑7)
 */
public class Huawei_055 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(select7(n));
        }

        sc.close();
    }

    public static int select7(int n) {
        if (n < 7) return 0;
        int sum = 0;
        for (int i = 7; i <= n; i++) {
            String str = String.valueOf(i);
            if (str.contains("7") || i % 7 == 0) sum++;
        }
        return sum;
    }
}
