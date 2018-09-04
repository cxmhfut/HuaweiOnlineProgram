package huawei.huawei_001_005;

import java.util.Scanner;

/**
 * 明明的随机数
 * 
 * @author Administrator
 *
 */
public class Huawei_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int arr[] = new int[1000];

			for (int i = 0; i < n; i++) {
				arr[sc.nextInt()] = 1;
			}

			int i = 0;
			while (i < 1000) {
				if (arr[i] == 1)
					System.out.println(i);
				i++;
			}
		}

		sc.close();
	}
}
