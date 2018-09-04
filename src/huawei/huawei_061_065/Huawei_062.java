package huawei.huawei_061_065;

import java.util.Scanner;

/**
 * 查找输入整数二进制中1的个数
 */
public class Huawei_062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(findNumberOf1(n));
        }

        sc.close();
    }

    public static int findNumberOf1(int n) {
        String str = Integer.toBinaryString(n);
        char ch[] = str.toCharArray();

        int count = 0;
        for (char c : ch) {
            if (c == '1') count++;
        }

        return count;
    }
}
