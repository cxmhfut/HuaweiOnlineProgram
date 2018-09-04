package huawei.huawei_086_090;

import java.util.Scanner;

/**
 * 密码强度等级
 */
public class Huawei_087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String pwd = sc.nextLine();
            getPwdSecurityLevel(pwd);
        }

        sc.close();
    }

    public static int getPwdSecurityLevel(String pwd){
        int score=0;
        int lower=0,upper=0,digital=0,other=0;

        char ch[] = pwd.toCharArray();

        if (ch.length <= 4) score = 5;
        else if (ch.length >= 5 && ch.length <= 7) score = 10;
        else score = 25;

        for(char c:ch){
            if(c>='a' && c<='z') lower++;
            else if(c>='A' && c<='Z') upper++;
            else if(c>='0' && c<='9') digital++;
            else other++;
        }

        //letter
        if(lower==0 && upper==0)score+=0;
        else if(lower==0 || upper==0) score+=10;
        else score+=20;

        //digital
        if(digital==0)score+=0;
        else if(digital==1)score+=10;
        else score+=20;

        //other
        if(other==0)score+=0;
        else if(other==1)score+=10;
        else score+=25;

        //reward
        if(lower!=0 && upper!=0 && digital!=0 && other!=0)score+=5;
        else if(lower+upper!=0 && digital!=0 && other!=0) score+=3;
        else if(lower+upper!=0 && digital!=0) score+=2;

        if(score>=90) System.out.println("VERY_SECURE");
        else if(score>=80) System.out.println("SECURE");
        else if(score>=70) System.out.println("VERY_STRONG");
        else if(score>=60) System.out.println("STRONG");
        else if(score>=50) System.out.println("AVERAGE");
        else if(score>=25) System.out.println("WEAK");
        else System.out.println("VERY_WEAK");

        return score;
    }
}
