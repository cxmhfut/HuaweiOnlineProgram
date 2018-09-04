package huawei.huawei_006_010;

import java.util.Scanner;

/**
 * 质数因子
 */
public class Huawei_006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			System.out.println(getResult(sc.nextLong()));
		}
		
		sc.close();
	}

	public static String getResult(long uIDataInput) {

		int i = 2;
		String result = "";
		while (i <= uIDataInput) {
			if (uIDataInput % i == 0) {
				result += i + " ";
				uIDataInput = uIDataInput / i;
			} else {
				i++;
			}
		}

		return result.equals("")?"":result;
	}
}
