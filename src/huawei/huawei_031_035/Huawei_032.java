package huawei.huawei_031_035;

import java.util.Scanner;

public class Huawei_032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.next();
            getMaxPalindromeLen(str);
        }

        sc.close();
    }

    public static void getMaxPalindromeLen(String str) {
        char ch[] = str.toCharArray();
        StringBuilder newStr = new StringBuilder();

        newStr.append('#');
        for (char c:ch){
            newStr.append(c);
            newStr.append('#');
        }

        ch = (new String(newStr)).toCharArray();
        int i=0;
        int max = 0;
        while (i<ch.length){
            max = Math.max(max,getPalindromeLen(ch,i++));
        }
        System.out.println(max);
    }

    public static int getPalindromeLen(char ch[],int center){
        int r=1;
        int left = center-1;
        int right = center+1;
        while (left>=0 && right<ch.length){
            if(ch[left]==ch[right]){
                left--;
                right++;
                r+=2;
            }else {
                break;
            }
        }

        return r/2;
    }
}
