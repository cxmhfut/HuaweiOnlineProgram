package huawei.huawei_071_075;

import java.util.Scanner;

/**
 * 百钱买百鸡问题
 */
public class Huawei_072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            sc.nextInt();

            for (int i = 0; i < 20; i++) {
                for (int j = 1; j < 33; j++) {
                    int k = 100 - i - j;
                    if (k % 3 == 0 && i * 5 + j * 3 + k / 3 == 100) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

        sc.close();
    }
}
