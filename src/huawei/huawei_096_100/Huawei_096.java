package huawei.huawei_096_100;

import java.util.Scanner;

/**
 * 表示数字
 */
public class Huawei_096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String s = sc.next();
            System.out.println(marknum(s));
        }

        sc.close();
    }

    public static String marknum(String str) {
        char ch[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i<ch.length){
            if(ch[i]>='0' && ch[i]<='9'){
                sb.append('*');
                sb.append(ch[i]);
                sb.append('*');
            }else {
                sb.append(ch[i]);
            }
            i++;
        }

        return (new String(sb)).replace("**","");
    }
}
