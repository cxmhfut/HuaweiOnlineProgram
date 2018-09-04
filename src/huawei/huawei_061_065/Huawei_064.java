package huawei.huawei_061_065;

import java.util.Scanner;

/**
 * MP3光标位置
 */
public class Huawei_064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            String str = sc.next();
            if (n <= 4) {
                MP3PlayerLow4(str, n);
            } else {
                MP3PlayerUp4(str, n);
            }
        }

        sc.close();
    }

    public static void MP3PlayerLow4(String str, int n) {
        char ch[] = str.toCharArray();
        int cur = 1;

        for (char c : ch) {
            if (cur == 1 && c == 'U') {
                cur = n;
                continue;
            }
            if (cur == n && c == 'D') {
                cur = 1;
                continue;
            }
            if (c == 'U') {
                cur--;
            }
            if (c == 'D') {
                cur++;
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(n);
        System.out.println(cur);
    }

    public static void MP3PlayerUp4(String str, int n) {
        char ch[] = str.toCharArray();
        int begin = 1, cur = 1;

        for (char c : ch) {
            if (begin == 1 && cur == 1 && c == 'U') {
                begin = n - 3;
                cur = n;
                continue;
            }
            if (begin == n - 3 && cur == n && c == 'D') {
                begin = 1;
                cur = 1;
                continue;
            }
            if (begin == cur && c == 'U') {
                begin--;
                cur--;
                continue;
            }
            if (begin + 3 == cur && c == 'D') {
                begin++;
                cur++;
                continue;
            }
            if (c == 'U') {
                cur--;
            }
            if (c == 'D') {
                cur++;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(begin + i + " ");
        }
        System.out.println(begin + 3);
        System.out.println(cur);
    }
}
