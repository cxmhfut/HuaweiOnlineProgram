package huawei.huawei_056_060;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入n个整数，输出其中最小的k个
 */

public class Huawei_058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < k; j++) {
                if (j == (k - 1))
                    System.out.println(arr[j]);//这个必须是换行 不然过不了 同理必须不空格！
                else
                    System.out.print(arr[j] + " ");
            }
        }

        in.close();
    }
}