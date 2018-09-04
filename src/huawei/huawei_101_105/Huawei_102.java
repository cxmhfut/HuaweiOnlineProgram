package huawei.huawei_101_105;

import java.util.*;

/**
 * 字符统计
 */
public class Huawei_102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            counter(str);
        }

        sc.close();
    }

    static class Letter {
        char c;
        int count;

        Letter(char c) {
            this.c = c;
            count = 1;
        }

        void add() {
            count++;
        }
    }

    public static void counter(String str) {
        char ch[] = str.toCharArray();
        List<Letter> letters = new ArrayList<>();
        Map<Character, Letter> map = new HashMap<>();

        int i = 0;
        while (i < ch.length) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') ||
                    (ch[i] >= 'A' && ch[i] <= 'Z') ||
                    (ch[i] >= '0' && ch[i] <= '9') ||
                    (ch[i] == ' '))
                if (map.containsKey(ch[i])) {
                    Letter letter = map.get(ch[i]);
                    letter.add();
                } else {
                    Letter letter = new Letter(ch[i]);
                    map.put(ch[i], letter);
                    letters.add(letter);
                }
            i++;
        }

        Collections.sort(letters, new Comparator<Letter>() {
            @Override
            public int compare(Letter o1, Letter o2) {
                if (o1.count == o2.count) {
                    return o1.c - o2.c;
                }
                return o2.count - o1.count;
            }
        });

        for (Letter letter : letters) {
            System.out.print(letter.c);
        }
        System.out.println();
    }
}
