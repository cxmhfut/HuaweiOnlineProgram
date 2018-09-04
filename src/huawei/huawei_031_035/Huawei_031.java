package huawei.huawei_031_035;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 【中级】单词倒排
 */
public class Huawei_031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            reverse(str);
        }

        sc.close();
    }

    public static void reverse(String str) {
        char ch[] = str.toCharArray();

        LinkedList<String> words = new LinkedList<>();

        int i = 0;
        while (i < ch.length) {
            StringBuilder tmp = new StringBuilder();
            while (i < ch.length && isLetter(ch[i])) {
                tmp.append(ch[i++]);
            }
            //System.out.println(tmp);
            if (tmp.length() != 0) {
                words.addFirst(new String(tmp));
            }
            i++;
        }

        while (!words.isEmpty()) {
            if(words.size()==1){
                System.out.println(words.pollFirst());
            }else {
                System.out.print(words.pollFirst()+" ");
            }
        }
    }

    public static boolean isLetter(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return c >= 'A' && c <= 'Z';
    }
}
