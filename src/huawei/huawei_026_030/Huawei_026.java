package huawei.huawei_026_030;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 字符串排序
 */
public class Huawei_026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            strSort(str);
        }

        sc.close();
    }

    public static void strSort(String str) {
        char ch[] = str.toCharArray();
        LinkedList<Character> charQueue = new LinkedList<>();

        for (int i = 0; i < 26; i++) {
            for (char c:ch) {
                if (c - 'a' == i || c - 'A' == i) {
                    charQueue.add(c);
                }
            }
        }

        for (char c : ch) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.print(charQueue.poll());
            }else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
