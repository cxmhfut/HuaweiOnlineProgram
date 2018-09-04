package huawei.huawei_011_015;

import java.util.Scanner;

/**
 * 字符串反转
 */
public class Huawei_012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			reverse2(line);
		}

		sc.close();
	}

	public static void reverse(String line) {
		char ch[] = line.toCharArray();

		int start = 0;
		int end = ch.length - 1;

		Huawei_013.reverse(ch,start,end);

		System.out.println(String.valueOf(ch));
	}

	public static void reverse2(String line) {
		char ch[] = line.toCharArray();

		int i = ch.length - 1;
		while (i >= 0) {
			System.out.print(ch[i--]);
		}
		System.out.println();
	}
}
