package huawei.huawei_081_085;

import java.util.Scanner;

/**
 * 统计大写字母个数
 */
public class Huawei_084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.next();
            calCapital(str);
        }

        sc.close();
    }

    public static void calCapital(String str){
        char ch[] = str.toCharArray();

        int count=0;
        for (char c:ch){
            if(c>='A' && c<='Z')count++;
        }

        System.out.println(count);
    }
}
