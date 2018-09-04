package huawei.huawei_026_030;

import java.util.Scanner;

/**
 * 字符串加密
 */
public class Huawei_029 {

    static String dict1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    static String dict2 = "bcdefghijklmnopqrstuvwxyzaBCDEFGHIJKLMNOPQRSTUVWXYZA1234567890";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String password = sc.nextLine();
            String result = sc.nextLine();
            Encrypt(password.toCharArray());
            unEncrypt(result.toCharArray());
        }

        sc.close();
    }

    public static void encrypt(char password[],String dict1,String dict2){
        for (int i=0;i<password.length;i++){
            int index = dict1.indexOf(password[i]);
            if(index!=-1){
                password[i] = dict2.charAt(index);
            }
        }
    }

    public static void Encrypt(char password[]) {
        encrypt(password,dict1,dict2);
        System.out.println(password);
    }

    public static void unEncrypt(char result[]) {
        encrypt(result,dict2,dict1);
        System.out.println(result);
    }
}
