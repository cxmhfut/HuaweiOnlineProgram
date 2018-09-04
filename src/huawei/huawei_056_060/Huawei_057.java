package huawei.huawei_056_060;

import java.util.Scanner;

/**
 * 无线OSS
 */
public class Huawei_057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String num1 = sc.nextLine().trim();
            String num2 = sc.nextLine().trim();
            add(num1, num2);
        }

        sc.close();
    }

    public static void add(String num1, String num2) {
        char num1Char = num1.charAt(0);
        char num2Char = num2.charAt(0);

        if (num1Char != '-' && num2Char != '-') {
            //num1:+ num2:+
            System.out.println(add(num1, num2, '+'));
        } else if (num1Char == '-' && num2Char == '-') {
            //num1:- num2:-
            num1 = num1.substring(1);
            num2 = num2.substring(1);
            System.out.println(add(num1, num2, '-'));
        }

        //TODO:计算减法？
    }

    public static String add(String num1, String num2, char resultChar) {
        StringBuilder s1 = (new StringBuilder(num1)).reverse();
        StringBuilder s2 = (new StringBuilder(num2)).reverse();
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = 0;
        while (i < s1.length() || i < s2.length()) {
            int a = i < s1.length() ? s1.charAt(i) - '0' : 0;
            int b = i < s2.length() ? s2.charAt(i) - '0' : 0;
            int r = a + b + carry;
            carry = r / 10;
            result.append(r % 10);
            i++;
        }

        if (carry == 1) {
            result.append(1);
        }

        if (resultChar == '-') {
            result.append('-');
        }

        return result.reverse().toString();
    }
}
