package huawei.huawei_091_095;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 记票统计
 */
public class Huawei_094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            sc.nextLine();
            String names[] = sc.nextLine().split(" ");
            sc.nextLine();
            String votenames[] = sc.nextLine().split(" ");
            vote(names,votenames);
        }

        sc.close();
    }

    public static void vote(String names[], String votenames[]) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : names) {
            map.put(name, 0);
        }

        int invalid = 0;
        for (String name : votenames) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                invalid++;
            }
        }

        for (String name : names) {
            System.out.println(name + " : " + map.get(name));
        }
        System.out.println("Invalid : " + invalid);
    }
}
