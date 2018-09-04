package huawei.huawei_041_045;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 名字的漂亮度
 */
public class Huawei_045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                String name = sc.next();
                nameBeauty(name);
            }
        }

        sc.close();
    }

    public static void nameBeauty(String name) {
        char ch[] = name.toCharArray();
        int a[] = new int[26];

        for (char c : ch) {
            if (c >= 'a' && c <= 'z') {
                a[c - 'a']++;
            } else {
                a[c - 'A']++;
            }
        }

        Arrays.sort(a);

        int result = 0;
        int i = 25;
        while (i >= 0 && a[i] != 0) {
            result += (i + 1) * a[i];
            i--;
        }
        System.out.println(result);
    }
}
