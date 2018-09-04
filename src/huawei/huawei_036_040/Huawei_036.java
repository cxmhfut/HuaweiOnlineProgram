package huawei.huawei_036_040;

import java.util.Scanner;

public class Huawei_036 {

    static String dataDict = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String key = sc.nextLine();
            String data = sc.nextLine();
            encrypt(key,data);
        }

        sc.close();
    }

    public static void encrypt(String key, String data) {
        key = key.toUpperCase();
        char chKey[] = key.toCharArray();

        int i=0;
        StringBuilder keySet = new StringBuilder();
        while (i<chKey.length){
            if(keySet.indexOf(""+chKey[i])==-1){
                keySet.append(chKey[i]);
            }
            i++;
        }
        char ch[] = dataDict.toCharArray();
        i = 0;
        while (i<26){
            if(keySet.indexOf(""+ch[i])==-1){
                keySet.append(ch[i]);
            }
            i++;
        }

        String encryptDict = new String(keySet);
        encryptDict = encryptDict + encryptDict.toLowerCase();

        Huawei_021.charChange(data,dataDict,encryptDict);
    }
}
