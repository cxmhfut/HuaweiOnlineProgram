package huawei.huawei_021_025;

import java.util.Scanner;

/**
 * 删除字符串中出现次数最少的字符
 */
public class Huawei_023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.next();
            getResult(line);
        }

        sc.close();
    }

    public static void getResult(String str) {
        int a[] = new int[26];

        char ch[] = str.toCharArray();

        for (char c : ch) {
            a[c - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0 && a[i]<min){
                min = a[i];
            }
        }

        for (char c:ch){
            if(a[c-'a']!=min)
                System.out.print(c);
        }
        System.out.println();
    }
}
