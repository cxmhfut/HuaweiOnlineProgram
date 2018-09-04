package huawei.huawei_056_060;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 找出字符串中第一个只出现一次的字符
 */
public class Huawei_059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            getOnceFirstChar(line);
        }

        sc.close();
    }

    public static void getOnceFirstChar(String line) {
        char ch[] = line.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i < ch.length) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], 1);
            }
            i++;
        }

        for (char c : ch) {
            if (map.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }

        System.out.println(-1);
    }
}
