package huawei.huawei_001_005;

import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 * 
 * @author Administrator
 *
 */
public class Huawei_001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(getLastLength(line));
		}

		sc.close();
	}

	public static int getLastLength(String str) {
		String[] arr = str.split(" ");
		return arr[arr.length - 1].length();
	}
}
