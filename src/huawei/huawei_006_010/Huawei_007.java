package huawei.huawei_006_010;

import java.util.Scanner;

/**
 * 取近似值
 */
public class Huawei_007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			getNum(sc.nextDouble());
		}
		
		sc.close();
	}

	public static void getNum(double num) {
		int x = (int) (num+0.5);
		System.out.println(x);
	}
}
