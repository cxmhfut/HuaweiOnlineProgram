package huawei.huawei_016_020;

import java.util.Scanner;

/**
 * 密码验证合格程序
 */
public class Huawei_020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String pwd = sc.nextLine();
            checkPwd(pwd);
        }

        sc.close();
    }

    public static void checkPwd(String pwd) {
        if (checkLength(pwd) && checkCharKinds(pwd) && checkContains(pwd)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }

    public static boolean checkLength(String pwd) {
        if (pwd == null || pwd.length() <= 8) {
            return false;
        }
        return true;
    }

    public static boolean checkCharKinds(String pwd) {
        char ch[] = pwd.toCharArray();

        int i = 0;
        int digit = 0, lowercase = 0, uppercase = 0, others = 0;

        while (i < ch.length) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                digit = 1;
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                lowercase = 1;
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                uppercase = 1;
            } else {
                others = 1;
            }
            i++;
        }

        int total = digit + lowercase + uppercase + others;
        return total >= 3;
    }

    //不能有相同长度超2的子串重复
    public static boolean checkContains(String pwd) {
        for (int i = 0; i < pwd.length() - 2; i++) {
            String subLen3 = pwd.substring(i, i + 3);
            if (pwd.substring(i + 1).contains(subLen3)) {
                return false;
            }
        }

        return true;
    }
}
