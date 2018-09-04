package huawei.huawei_021_025;

import java.util.Scanner;

/**
 * 合唱队
 */

public class Huawei_024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int a[] = new int[n];
            int i=0;
            while (i<n){
                a[i++] = sc.nextInt();
            }
            maxInc(a);
        }

        sc.close();
    }

    //186 186 150 200 160 130 197 200
    // 1   1   1   2   2   1   3   4
    // 3   3   2   3   2   1   1   1
    //aim:找出不同位置左边的最长递增子序列和右边的最长递减子序列
    public static void maxInc(int[] arr) {
        int n = arr.length;
        int inc1[] = new int[n];   //从左往右最长递增子序列长度
        int inc2[] = new int[n];   //从右往左最长递增子序列长度

        inc1[0] = 1;
        for (int i = 1; i < n; i++) {
            inc1[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && inc1[j] + 1 > inc1[i])
                    inc1[i] = inc1[j] + 1;
            }
        }

        inc2[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            inc2[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[i] > arr[j] && inc2[j] + 1 > inc2[i]) {
                    inc2[i] = inc2[j] + 1;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (res < inc1[i] + inc2[i]) {
                res = inc1[i] + inc2[i];
            }
        }

        //重复算了一个交叉的位置
        res -= 1;

        System.out.println(n-res);
    }

}
