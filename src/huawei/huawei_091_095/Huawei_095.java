package huawei.huawei_091_095;

import java.util.Scanner;

/**
 * 人民币转换
 */
public class Huawei_095 {

    private static String map[] = {"壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String money = sc.next();
            resove(money);
        }

        sc.close();
    }

    private static void resove(String money) {
        String moneyParts[] = money.split("\\.");
        int number = Integer.valueOf(moneyParts[0]);

        StringBuilder res = new StringBuilder();
        res.append("人民币");

        int yi = number / 100000000;
        if (yi != 0) {
            res.append(resolveMoney(yi)).append("亿");
            number -= yi * 100000000;
        }

        int wan = number / 10000;
        if (wan != 0) {
            res.append(resolveMoney(wan)).append("万");
            number -= wan * 10000;
        }

        String beforePonitStr = resolveMoney(number);
        if (beforePonitStr.length() > 0) {
            res.append(beforePonitStr).append("元");
        }

        if (moneyParts.length > 1) {
            String afterPointStr = moneyParts[1];
            res.append(handleMoneyAfterPoint(Integer.valueOf(afterPointStr)));
        }

        String result = res.toString();
        if (result.length() > 4 && result.charAt(3) == '零') {
            result = result.substring(0, 3) + result.substring(4);
        }

        System.out.println(result);
    }

    private static String resolveMoney(int money) {

        StringBuilder res = new StringBuilder();

        int qian = money / 1000;
        if (qian != 0) {
            res.append(map[qian - 1]).append("仟");
            money -= qian * 1000;
        }

        int bai = money / 100;
        if (bai != 0) {
            res.append(map[bai - 1]).append("佰");
            money -= bai * 100;
        }

        //10xx 零只可能出现在百位和十位
        if (qian != 0 && bai == 0) {
            res.append("零");
        }

        int shi = money / 10;
        if (shi != 0) {
            if (shi != 1) {
                res.append(map[shi - 1]);
            }
            res.append("拾");
            money -= shi * 10;
        }

        //110X 零只可能出现在百位和十位
        if (bai != 0 && shi == 0) {
            res.append("零");
        }

        int ge = money;
        if (ge != 0) {
            //处理1,0001这种情况，
            if (qian == 0 && bai == 0 && shi == 0) {
                res.append("零");
            }
            res.append(map[ge - 1]);
        }

        String result = res.toString();
        if (qian != 0 && bai == 0 && shi == 0 && ge == 0) {
            result = map[qian - 1] + "仟";
        }

        return result;
    }

    private static String handleMoneyAfterPoint(int money) {
        StringBuilder res = new StringBuilder();
        if (money == 0) {
            res.append("整");
        } else {
            int jiao = money / 10;
            if (jiao != 0) {
                res.append(map[jiao - 1]).append("角");
                money -= jiao * 10;
            }

            int fen = money;
            if (fen != 0) {
                res.append(map[fen - 1]).append("分");
            }
        }

        return res.toString();
    }
}
