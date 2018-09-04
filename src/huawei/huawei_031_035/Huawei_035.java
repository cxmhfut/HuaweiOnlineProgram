package huawei.huawei_031_035;

import java.util.Scanner;

/**
 * 蛇形矩阵
 */
public class Huawei_035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            getResult(N);
        }

        sc.close();
    }

    public static void getResult(int N) {
        int first = 1;
        for (int i = 1; i <= N; i++) {
            output(first, i + 1, N - i + 1);
            first += i;
        }
    }

    public static void output(int first, int firstAdd, int count) {
        int i = 0;
        while (i < count) {
            if (i == count - 1) {
                System.out.println(first);
            } else {
                System.out.print(first + " ");
            }
            first += firstAdd;
            firstAdd++;
            i++;
        }
    }
}
