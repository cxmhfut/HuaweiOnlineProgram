package huawei.huawei_031_035;

import java.util.Scanner;

public class Huawei_033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String ip = sc.nextLine();
            String value = sc.nextLine();
            ipToint(ip);
            intToip(value);
        }

        sc.close();
    }

    public static void ipToint(String ip){
        String ips[] = ip.split("\\.");
        int a = Integer.parseInt(ips[0]);
        int b = Integer.parseInt(ips[1]);
        int c = Integer.parseInt(ips[2]);
        int d = Integer.parseInt(ips[3]);

        System.out.println((getUnsignedIntt(a)<<24)|(getUnsignedIntt(b)<<16)|(getUnsignedIntt(c)<<8)|getUnsignedIntt(d));
    }

    public static long getUnsignedIntt (int data){ //将int数据转换为0~4294967295 (0xFFFFFFFF即DWORD)。
        return data&0x0FFFFFFFF ;
    }

    public static void intToip(String value){
        Long longValue = Long.parseLong(value);

        System.out.println(((longValue&0xff000000)>>24)+"."+
                            ((longValue&0x00ff0000)>>16)+"."+
                            ((longValue&0x0000ff00)>>8)+"."+
                            ((longValue&0x000000ff)));
    }
}
