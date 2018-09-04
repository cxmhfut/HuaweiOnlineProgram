package huawei.huawei_001_005;

import java.util.Scanner;

/**
 * 进制转换
 * 
 * @author Administrator
 *
 */
public class Huawei_005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(getOxNum(line));
		}

		sc.close();
	}

	public static int getOxNum(String oxNum) {
		String newOxNum = oxNum.substring(2);
		char ch[] = newOxNum.toCharArray();

		int i = 0;
		int res = 0;
		while (i < ch.length) {
			if (ch[i] >= 'A' && ch[i] <= 'F')
				res = res * 16 + (ch[i] - 'A' + 10);
			else
				res = res * 16 + (ch[i] - '0');
			i++;
		}

		Integer.parseInt("0xA",16);
		
		return res;
	}
}
