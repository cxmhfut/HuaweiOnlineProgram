package huawei.huawei_011_015;

import java.util.Scanner;

/**
 * 求int型数据在内存中存储时1的个数
 */
public class Huawei_015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			System.out.println(getResult(sc.nextInt()));
		}

		sc.close();
	}

	public static int getResult(int num) {

		int count = 0;

		while (num >= 0) {
			if ((num & 1) > 0)
				count++;
			num = num >> 1;
		}

		return count++;
	}
}
