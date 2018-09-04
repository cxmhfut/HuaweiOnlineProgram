package huawei.huawei_036_040;

import java.util.Scanner;

public class Huawei_037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int m = sc.nextInt();
            System.out.println(getTotalCount(m));
        }

        sc.close();
    }

    public static int getTotalCount(int monthCount) {
        int oneMonth = 1, twoMonth = 0, threeMonth = 0;
        while (--monthCount != 0) {
            threeMonth += twoMonth;
            twoMonth = oneMonth;
            oneMonth = threeMonth;
        }
        return oneMonth + twoMonth + threeMonth;
    }
}
