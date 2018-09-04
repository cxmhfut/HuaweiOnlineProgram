package huawei.huawei_026_030;

import java.util.Scanner;

/**
 * 字符串合并排序
 */
public class Huawei_030 {

    static String dict1 = "0123456789abcdefABCDEF";
    static String dict2 = "084C2A6E195D3B7F5D3B7F";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            processString(str1, str2);
        }

        sc.close();
    }

    public static char getEncryptChar(char c) {
        int index = dict1.indexOf(c);
        if (index != -1) {
            c = dict2.charAt(index);
        }
        return c;
    }

    public static void processString(String str1, String str2) {

        String sortedStr = sort(str1 + str2);
        char ch[] = sortedStr.toCharArray();
        int i = 0;
        while (i < ch.length) {
            System.out.print(getEncryptChar(ch[i++]));
        }

        System.out.println();
    }

    public static String sort(String str) {
        if (str == null || str.length() == 0)
            return str;
        char[] nums = str.toCharArray();
        for (int k = 0; k < 2; k++) {
            for (int i = k + 2; i < nums.length; i += 2) {
                int j = i - 2;
                char key = nums[i];
                while (j >= 0 && nums[j] > key) {
                    nums[j + 2] = nums[j];
                    j -= 2;
                }
                nums[j + 2] = key;
            }
        }
        return new String(nums);
    }
}