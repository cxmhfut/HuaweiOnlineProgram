package huawei.huawei_086_090;

import java.util.Scanner;

/**
 * 合法IP
 */
public class Huawei_090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String ip = sc.nextLine();
            isValidIP(ip);
        }

        sc.close();
    }

    public static void isValidIP(String ip){
        if(ip.contains(" ")){
            System.out.println("NO");
            return;
        }

        String ips[] = ip.split("\\.");
        if(ips.length!=4){
            System.out.println("NO");
            return;
        }

        try {
            for (String s:ips){
                int n = Integer.valueOf(s);
                if(n<0||n>255){
                    System.out.println("NO");
                    return;
                }
            }
        }catch (NumberFormatException e){
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }
}
