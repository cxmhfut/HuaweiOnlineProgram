package huawei.huawei_031_035;

import java.util.Scanner;

/**
 * 图片整理
 */
public class Huawei_034 {

    static char chS[]="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String line = sc.next();
            picSort(line);
        }

        sc.close();
    }

    public static void picSort(String str){
        char ch[] = str.toCharArray();
        int a[] = new int[62];

        int i=0;
        while (i<ch.length){
            if(ch[i]>='0' && ch[i]<='9'){
                a[ch[i]-'0']++;
            }else if(ch[i]>='A' && ch[i]<='Z'){
                a[ch[i]-'A'+10]++;
            }else{
                a[ch[i]-'a'+36]++;
            }
            i++;
        }

        for (i=0;i<chS.length;i++){
            while (a[i]>0) {
                System.out.print(chS[i]);
                a[i]--;
            }
        }
        System.out.println();
    }
}
