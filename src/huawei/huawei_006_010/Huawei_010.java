package huawei.huawei_006_010;

import java.util.Scanner;

/**
 * 字符个数统计
 */
public class Huawei_010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			getResult(line);
		}

		sc.close();
	}

	public static void getResult(String line) {
		char ch[] = line.toCharArray();
		int a[] = new int[128];
		int i = 0;
		while (i < ch.length) {
			if (ch[i] >= 0 && ch[i] <= 127) {
				a[ch[i]]++;
			}
			i++;
		}

		int count = 0;
		for (i = 0; i < 128; i++) {
			if (a[i] > 0)
				count++;
		}

		System.out.println(count);
	}
}
