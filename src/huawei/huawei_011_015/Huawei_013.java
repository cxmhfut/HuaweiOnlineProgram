package huawei.huawei_011_015;

import java.util.Scanner;

/**
 * 句子逆序
 */
public class Huawei_013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String sentence = sc.nextLine();
			System.out.println(reverse(sentence));
		}

		sc.close();
	}

	public static String reverse(String sentence) {
		char ch[] = sentence.toCharArray();
		int i = 0;
		while (i < ch.length) {
			int index = sentence.indexOf(" ", i);
			if (index != -1) {
				reverse(ch, i, index - 1);
			} else {
				reverse(ch, i, ch.length - 1);
				break;
			}
			i = index + 1;
		}
		reverse(ch, 0, ch.length - 1);

		return String.valueOf(ch);
	}

	public static void reverse(char ch[], int start, int end) {
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
	}
}
