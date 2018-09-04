package huawei.huawei_006_010;

import java.util.Scanner;

/**
 * 提取不重复的整数
 */
public class Huawei_009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			getResult(sc.nextInt());
		}

		sc.close();
	}

	public static void getResult(int n) {
		int a[] = new int[10];
		int num = 0;
		while (n != 0) {
			if (a[n % 10] == 0) {
				a[n % 10]++;
				num = num * 10 + n % 10;
			}
			n = n / 10;
		}
		System.out.println(num);
	}
}
