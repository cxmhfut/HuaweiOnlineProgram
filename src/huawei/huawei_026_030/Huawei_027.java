package huawei.huawei_026_030;

import java.util.*;

/**
 * 查找兄弟单词
 */
public class Huawei_027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            String words[] = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
            }

            String key = sc.next();
            int m = sc.nextInt();
            brotherWords(words, key, m);
        }

        sc.close();
    }

    public static void brotherWords(String words[], String key, int m) {
        char keyChar[] = key.toCharArray();
        Arrays.sort(keyChar);

        int count = 0;
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int result = check(key, word, keyChar);
            count += result;
            if (result == 1) {
                list.add(word);
            }
        }

        System.out.println(count);
        Collections.sort(list);
        if (count >= m) {
            System.out.println(list.get(m - 1));
        }
    }

    public static int check(String key, String word, char keyChar[]) {
        if (key.equals(word) || key.length() != word.length()) {
            return 0;
        }

        char wordChar[] = word.toCharArray();
        Arrays.sort(wordChar);
        return Arrays.equals(keyChar, wordChar) ? 1 : 0;
    }
}
