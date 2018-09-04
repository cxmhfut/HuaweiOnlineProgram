package huawei.huawei_081_085;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 字符串匹配
 */
public class Huawei_081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String shortStr = sc.nextLine();
            String longStr = sc.nextLine();
            System.out.println(allCharExists(shortStr, longStr));
        }

        sc.close();
    }

    public static boolean allCharExists(String shortStr, String longStr) {
        char chShort[] = shortStr.toCharArray();
        char chLong[] = longStr.toCharArray();
        Set<Character> setShort = new HashSet<>();
        Set<Character> setLong = new HashSet<>();

        for (char c : chShort) {
            setShort.add(c);
        }

        for (char c : chLong) {
            if (setShort.contains(c)) {
                setLong.add(c);
            }
        }

        return setShort.size() == setLong.size();
    }
}
