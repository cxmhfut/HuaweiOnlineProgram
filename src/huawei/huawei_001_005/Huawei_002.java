package huawei.huawei_001_005;

import java.util.Scanner;

/**
 * 计算字符个数
 * 
 * @author Administrator
 *
 */
public class Huawei_002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			String c = sc.nextLine();
			System.out.println(getCharCount(line, c));
		}

		sc.close();
	}

	public static int getCharCount(String line, String c) {

		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if ((line.charAt(i) + "").equalsIgnoreCase(c))
				count++;
		}

		return count;
	}
}
