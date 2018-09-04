package huawei.huawei_011_015;

import java.util.Scanner;

/**
 * 数字颠倒
 */
public class Huawei_011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            reverse(sc.nextInt());
        }

        sc.close();
    }

    public static void reverse(int num) {
        String result = "";

        if (num == 0) {
            System.out.println("0");
            return;
        }

        while (num != 0) {
            result += num % 10;
            num /= 10;
        }

        System.out.println(result);
    }
}
