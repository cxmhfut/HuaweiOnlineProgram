package huawei.huawei_036_040;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
 */
public class Huawei_040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String s = sc.nextLine();
            charCount(s);
        }

        sc.close();
    }

    public static void charCount(String str) {
        char ch[] = str.toCharArray();
        int englishChar = 0;
        int blankChar = 0;
        int numberChar = 0;
        int otherChar = 0;

        for (char c : ch) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                englishChar++;
            } else if (c >= '0' && c <= '9') {
                numberChar++;
            } else if (c == ' ') {
                blankChar++;
            } else {
                otherChar++;
            }
        }

        System.out.println(englishChar);
        System.out.println(blankChar);
        System.out.println(numberChar);
        System.out.println(otherChar);
    }
}
