package huawei.huawei_101_105;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 */
public class Huawei_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sortType = sc.nextInt();
            sort(arr,sortType);
        }

        sc.close();
    }

    public static void sort(int arr[], int sortType) {
        Arrays.sort(arr);

        if (sortType == 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[arr.length - 1]);
        } else {
            for (int i = arr.length - 1; i > 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[0]);
        }
    }
}
