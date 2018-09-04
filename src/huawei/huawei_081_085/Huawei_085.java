package huawei.huawei_081_085;

import java.util.Scanner;

/**
 * 字符串运用-密码截取
 */
public class Huawei_085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String pwd = sc.nextLine();
            System.out.println(getLongestProlindromeLength(pwd));
        }

        sc.close();
    }

    public static int getLongestProlindromeLength(String pwd) {
        char ch[] = pwd.toCharArray();
        StringBuilder sb = new StringBuilder();

        sb.append('#');
        for (char c : ch) {
            sb.append(c);
            sb.append('#');
        }

        int maxLen = 0;
        for (int i = 0; i < sb.length(); i++) {
            int r = 1;
            while (i - r >= 0 && i + r < sb.length() && sb.charAt(i - r) == sb.charAt(i + r)) {
                r++;
            }
            maxLen = maxLen > r ? maxLen : r;
        }

        return maxLen-1;
    }
}
