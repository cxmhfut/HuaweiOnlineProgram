package huawei.huawei_086_090;

import java.util.Scanner;

/**
 * 扑克牌大小
 */
public class Huawei_088 {

    static String pokerKey = "34567891JQKA2";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String pokers = sc.nextLine();
            pokerCompare(pokers);
        }

        sc.close();
    }

    public static void pokerCompare(String pokers) {
        String pokersArr[] = pokers.split("-");
        String pokersAStr = pokersArr[0];
        String pokersBStr = pokersArr[1];
        String pokersA[] = pokersAStr.split(" ");
        String pokersB[] = pokersBStr.split(" ");

        if (isBoom(pokersA) && isBoom(pokersB)) {
            //A和B的牌都是炸弹
            pokerCompareBoom(pokersA, pokersB);
        } else if (isBoom(pokersA)) {
            pokerOutput(pokersA);
        } else if (isBoom(pokersB)) {
            pokerOutput(pokersB);
        } else {
            //A 和 B都不是炸弹
            if (pokersA.length == pokersB.length) {
                pokerCompare(pokersA, pokersB);
            } else {
                System.out.println("ERROR");
            }
        }

    }

    public static boolean isBoom(String pokers[]) {
        if (pokers.length == 2 && pokers[0].equals("joker")) {
            return true;
        } else if (pokers.length == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static void pokerCompareBoom(String pokersA[], String pokersB[]) {
        if (pokersA.length == pokersB.length) {
            pokerCompareNoJoker(pokersA, pokersB);
        } else {
            String pokers[] = pokersA.length < pokersB.length ? pokersA : pokersB;
            pokerOutput(pokers);
        }

    }

    public static void pokerCompare(String pokersA[], String pokersB[]) {
        if (pokersA.length == 1) {
            if (pokersA[0].equals("JOKER") || pokersB[0].equals("JOKER")) {
                pokerOutput(pokersA[0].equals("JOKER") ? pokersA : pokersB);
            } else if (pokersA[0].equals("joker") || pokersB[0].equals("joker")) {
                pokerOutput(pokersA[0].equals("joker") ? pokersA : pokersB);
            } else {
                pokerCompareNoJoker(pokersA, pokersB);
            }
        } else {
            pokerCompareNoJoker(pokersA, pokersB);
        }
    }

    public static void pokerCompareNoJoker(String pokersA[], String pokersB[]) {
        int valueA = pokerKey.indexOf(pokersA[0].charAt(0));
        int valueB = pokerKey.indexOf(pokersB[0].charAt(0));
        pokerOutput(valueA > valueB ? pokersA : pokersB);
    }

    public static void pokerOutput(String pokers[]) {
        for (int i = 0; i < pokers.length - 1; i++) {
            System.out.print(pokers[i] + " ");
        }
        System.out.println(pokers[pokers.length - 1]);
    }
}
