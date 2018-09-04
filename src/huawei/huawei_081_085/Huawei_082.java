package huawei.huawei_081_085;

import java.util.Scanner;

/**
 * 将真分数分解为埃及分数
 */
public class Huawei_082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String nums[] = line.split("/");
            int a = Integer.valueOf(nums[0]);
            int b = Integer.valueOf(nums[1]);
            egyptTrans(a, b);
        }

        sc.close();
    }

    /**
     * 设a、b为互质正整数，a<b 分数a/b 可用以下的步骤分解成若干个单位分数之和：
     * 步骤一： 用b除以a，得商数q及余数r,即b=a*q+r
     * 步骤二： a/b=1/(q+1）+(a-r)/b(q+1）
     * 步骤三： 重复步骤2，直到分解完毕
     * 3/7=1/3+2/21=1/3+1/11+1/231
     * 13/23=1/2+3/46=1/2+1/16+1/368
     */
    public static void egyptTrans(int a, int b) {
        while (a != 1) {
            if (b % (a - 1) == 0) {
                System.out.println("1/" + (b / (a - 1)) + "+1/" + b);
                return;
            } else {
                int q = b / a;
                int r = b % a;
                System.out.print("1/" + (q + 1) + "+");
                a = a - r;
                b = b * (q + 1);
                if (b % a == 0) {
                    b = b / a;
                    a = 1;
                }
            }
        }
        System.out.println("1/" + b);
    }
}
