package huawei.huawei_001_005;

import java.util.Scanner;

/**
 * 字符串分隔
 * 
 * @author Administrator
 *
 */
public class Huawei_004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			strSplit(line);
		}

		sc.close();
	}

	public static void strSplit(String str) {
		String baseStr[] = new String[] { "", "0000000", "000000", "00000", "0000", "000", "00", "0" };
		String newStr = str + baseStr[str.length() % 8];

		int start = 0;
		while (start < newStr.length()) {
			System.out.println(newStr.substring(start, start + 8));
			start = start + 8;
		}
	}
}
