package huawei.huawei_061_065;

import java.util.Scanner;

/**
 * 查找两个字符串a,b中的最长公共子串
 */
public class Huawei_065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            getLCSBase(s1, s2);
        }

        sc.close();
    }

    public static void getLCSBase(String s1, String s2) {
        String min = s1.length() > s2.length() ? s2 : s1;
        String max = s1.length() > s2.length() ? s1 : s2;

        String lcs = "";
        int maxLen = 0;

        for (int i = 0; i < min.length(); i++) {
            int len = 0;
            for (int j = i; j < min.length(); j++) {
                if (max.contains(min.substring(i, j + 1))) {
                    len++;
                } else {
                    break;
                }
            }
            if (len > maxLen) {
                maxLen = len;
                lcs = min.substring(i, i + maxLen);
            }
        }

        System.out.println(lcs);
    }

    public static void getLCS(String s1, String s2) {
        int tag[][] = new int[s1.length()][s2.length()];

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        int max = 0;
        int end = 0;

        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    if (i == 0 || j == 0) {
                        tag[i][j] = 1;
                    } else {
                        tag[i][j] = tag[i - 1][j - 1] + 1;
                    }
                } else {
                    tag[i][j] = 0;
                }

                if (tag[i][j] > max) {
                    max = tag[i][j];
                    end = j;
                }
            }
        }

        System.out.println(s2.substring(end - max + 1, end + 1));
    }
}
