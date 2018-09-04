package huawei.huawei_011_015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字串的连接最长路径查找
 */
public class Huawei_014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int num = sc.nextInt();
			String[] ss = new String[num];
			for (int i = 0; i < num; i++) {
				ss[i] = sc.next();
			}
			Arrays.sort(ss);
			for (int i = 0; i < ss.length; i++) {
				System.out.println(ss[i]);
			}

		}

		sc.close();
	}
}
