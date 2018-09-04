package huawei.huawei_061_065;

import java.util.Scanner;

/**
 * DNA序列
 */
public class Huawei_063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String dna = sc.nextLine();
            int len = sc.nextInt();
            DNA(dna, len);
        }

        sc.close();
    }

    public static void DNA(String dna, int length) {
        String maxDNASlice = "";
        int maxGCRatio = 0;
        for (int i = 0; i <= dna.length() - length; i++) {
            String temp = dna.substring(i, i + length);
            int curGCRatio = GCRatio(temp);
            if (maxGCRatio < GCRatio(temp)) {
                maxDNASlice = temp;
                maxGCRatio = curGCRatio;
            }
        }

        System.out.println(maxDNASlice);
    }

    public static int GCRatio(String dnaSlice) {
        char ch[] = dnaSlice.toCharArray();
        int count = 0;
        for (char c : ch) {
            if (c == 'G' || c == 'C') {
                count++;
            }
        }
        return count;
    }
}
