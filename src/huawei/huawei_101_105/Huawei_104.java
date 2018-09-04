package huawei.huawei_101_105;

import java.util.Scanner;

/**
 * 字符串分割
 */
public class Huawei_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            for (int i=0;i<n;i++){
                split(sc.next());
            }
        }

        sc.close();
    }

    public static void split(String str) {
        if(str.equals(""))return;
        int zeros = str.length() % 8;
        if (zeros != 0) zeros = 8 - zeros;
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < zeros; i++) {
            sb.append("0");
        }

        for(int start=0;start<sb.length();start+=8){
            System.out.println(sb.substring(start,start+8));
        }
    }
}
