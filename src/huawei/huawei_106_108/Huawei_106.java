package huawei.huawei_106_108;

import java.util.Scanner;

/**
 * 字符逆序
 */
public class Huawei_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            reverse(str);
        }

        sc.close();
    }

    public static void reverse(String str){
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = ch.length-1;
        while (i>=0){
            sb.append(ch[i]);
            i--;
        }

        System.out.println(sb);
    }
}
