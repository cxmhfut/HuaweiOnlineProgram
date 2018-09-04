package huawei.huawei_091_095;

import java.util.Scanner;

/**
 * 在字符串中找出连续最长的数字串
 */
public class Huawei_092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            continuemax(s);
        }

        sc.close();
    }

    public static void continuemax(String str) {
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : ch) {
            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                sb.append('a');
            }
        }

        String newStr = sb.toString();
        String strs[] = newStr.split("a");
        int max = 0;
        for (String s : strs) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        for (String s : strs) {
            if (s.length() == max) {
                System.out.print(s);
            }
        }
        System.out.println("," + max);
    }
}
