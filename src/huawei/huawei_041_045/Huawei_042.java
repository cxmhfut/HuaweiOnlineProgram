package huawei.huawei_041_045;

import java.util.Scanner;

/**
 * 学英语
 */
public class Huawei_042 {

    static String en0to9[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String en10to19[] = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String en00to90[] = {
            "", "ten", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            System.out.println(parse(sc.nextLong()));
        }

        sc.close();
    }

    public static String parse(long num) {
        if (num < 0) return "error";
        StringBuilder sb = new StringBuilder();
        long billion = num / 1000000000;//billion 十亿部分
        if (billion != 0)
            sb.append(translate(billion) + " billion");
        num = num % 1000000000;
        long million = num / 1000000;
        if (million != 0) {
            if (billion != 0) sb.append(" ");
            sb.append(translate(million) + " million");
        }
        num = num % 1000000;
        long thousand = num / 1000;
        if (thousand != 0) {
            if (billion != 0 || million != 0)
                sb.append(" ");
            sb.append(translate(thousand) + " thousand");
        }
        num = num % 1000;
        long hundred = num % 1000;
        if (hundred != 0) {
            if (billion != 0 || million != 0 || thousand != 0)
                sb.append(" ");
            sb.append(translate(hundred));
        }

        return new String(sb);
    }

    public static String translate(long num) {
        StringBuilder sb = new StringBuilder();
        int b = (int) (num / 100);//百位
        if (b != 0) {
            sb.append(en0to9[b] + " hundred");
        }
        num = num % 100;
        int s = (int) (num / 10);//十位
        int g = (int) (num % 10);//个位
        if (s != 0) {
            if (b != 0) sb.append(" and ");
            if (s == 1) sb.append(en10to19[g]);
            else {
                //2<=k<=9
                sb.append(en00to90[s]);
                if (g != 0) {
                    sb.append(" ");
                    sb.append(en0to9[g]);
                }
            }
        } else if (g != 0) {
            if (b != 0) sb.append(" and ");
            sb.append(en0to9[g]);
        }
        return new String(sb);
    }
}
