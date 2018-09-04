package huawei.huawei_076_080;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 整形数组合并
 */
public class Huawei_080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int m = sc.nextInt();
            Set<Integer> ts = new TreeSet<>();
            for(int i=0;i<m;i++){
                ts.add(sc.nextInt());
            }
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                ts.add(sc.nextInt());
            }
            for(Integer i:ts){
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();
    }
}
