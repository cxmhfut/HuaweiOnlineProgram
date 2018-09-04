package huawei.huawei_021_025;

import java.util.Scanner;

/**
 * 简单密码破解
 */
public class Huawei_021 {
    static String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static String value = "bcdefghijklmnopqrstuvwxyza22233344455566677778889999";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String pwd = sc.next();
            charChange(pwd,key,value);
        }

        sc.close();
    }

    public static void charChange(String str,String key,String value) {


        char ch[] = str.toCharArray();

        int i=0;
        while (i<ch.length){
            int index = key.indexOf(ch[i]);
            if(index != -1){
                ch[i] = value.charAt(index);
            }
            i++;
        }

        System.out.println(ch);
    }
}
