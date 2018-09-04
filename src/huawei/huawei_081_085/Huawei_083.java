package huawei.huawei_081_085;

import java.util.Scanner;

/**
 * 二维数组操作
 */
public class Huawei_083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int row = in.nextInt();
            int col = in.nextInt();
            if (row > 9 || col > 9)
                System.out.println(-1);
            else
                System.out.println(0);
            int x = in.nextInt();
            int y = in.nextInt();
            int m = in.nextInt();
            int n = in.nextInt();
            if ((x >= 0 && x < row) && (m >= 0 && m < row) && (y >= 0 && y < col) && (n >= 0 && n < col) && !(x == m && y == n)) {
                System.out.println(0);
            } else
                System.out.println(-1);
            int addr = in.nextInt();
            if (addr >= 0 && addr < row)
                System.out.println(0);
            else
                System.out.println(-1);
            int addc = in.nextInt();
            if (addc >= 0 && addc < col)
                System.out.println(0);
            else
                System.out.println(-1);
            int i = in.nextInt();
            int j = in.nextInt();
            if (i >= 0 && i < row && j >= 0 && j < col)
                System.out.println(0);
            else
                System.out.println(-1);
        }
    }
}
