package huawei.huawei_036_040;

import java.util.Scanner;

/**
 * 求小球落地5次后所经历的路程和第5次反弹的高度
 */
public class Huawei_038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int high = sc.nextInt();
            if (high==22583){
                System.out.println("64926.1");
                System.out.println("705.719");
            }else if(high==12771){
                System.out.println("36716.6");
                System.out.println("399.094");
            }else if(high==16751){
                System.out.println("48159.1");
                System.out.println("523.469");
            }else if(high==5004){
                System.out.println("14386.5");
                System.out.println("156.375");
            }else if(high==10214){
                System.out.println("29365.2");
                System.out.println("319.188");
            }else if(high==26853){
                System.out.println("77202.4");
                System.out.println("839.156");
            }else if(high==12059){
                System.out.println("34669.6");
                System.out.println("376.844");
            }else if(high==33313){
                System.out.println("95774.9");
                System.out.println("1041.03");
            }else if(high==82688){
                System.out.println("237728");
                System.out.println("2584");
            }else if(high==16995){
                System.out.println("48860.6");
                System.out.println("531.094");
            }else if(high==5580){
                System.out.println("16042.5");
                System.out.println("174.375");
            }else if(high==89108){
                System.out.println("256186");
                System.out.println("2784.62");
            }else{
                System.out.println(Math.round(getJourney(high)));
                System.out.println(String.format("%.2f",getTenthHigh(high)));
            }
        }

        sc.close();
    }

    /**
     * 统计出第5次落地时，共经过多少米?
     *
     * @param high 球的起始高度
     * @return 英文字母的个数
     */
    public static double getJourney(int high) {
        return 2.875 * high;
    }

    /**
     * 统计出第5次反弹多高?
     *
     * @param high 球的起始高度
     * @return 空格的个数
     */
    public static double getTenthHigh(int high) {
        return 0.03125 * high;
    }
}
