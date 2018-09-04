package huawei.huawei_076_080;

import java.util.Scanner;

/**
 * 超长正整数相加
 */
public class Huawei_078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String addend = sc.nextLine();
            String augend = sc.nextLine();
            System.out.println(addLongInteger(addend, augend));
        }

        sc.close();
    }

    public static String addLongInteger(String addend, String augend) {
        char chAddend[] = new StringBuilder(addend).reverse().toString().toCharArray();
        char chAugend[] = new StringBuilder(augend).reverse().toString().toCharArray();
        StringBuilder sb = new StringBuilder();

        int carry = 0;//当前进位
        int lenMax = chAddend.length > chAugend.length ? chAddend.length : chAugend.length;

        int i = 0;
        while (i < lenMax) {
            int a = i < chAddend.length ? (chAddend[i] - '0') : 0;
            int b = i < chAugend.length ? (chAugend[i] - '0') : 0;
            int result = a + b + carry;
            carry = result / 10;
            sb.append(result % 10);
            i++;
        }

        if (carry == 1) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}
