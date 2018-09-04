package huawei.huawei_021_025;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 数据分类处理
 */
public class Huawei_025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int R[] = new int[]{6, 3, 6, 3, 0};
        //int I[] = new int[]{123, 456, 786, 453, 46, 7, 5, 3, 665, 453456, 745, 456, 786, 453, 123};
        //dataProcess(R, I);
        while (sc.hasNext()) {
            String I = sc.nextLine();
            String R = sc.nextLine();
            String[] arrI = I.split(" ");
            String[] arrR = R.split(" ");
            dataProcess(arrR,arrI);
        }

        sc.close();
    }

    public static void dataProcess(String[] R, String[] I) {
        TreeSet<Integer> setR = new TreeSet<>();

        for(int i=1;i<R.length;i++){
            setR.add(Integer.parseInt(R[i]));
        }

        LinkedList<Integer> result = new LinkedList<>();
        for (int iR:setR){
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i=1;i<I.length;i++){
                if(I[i].contains(""+iR)){
                    tmp.add(i-1);
                    tmp.add(Integer.parseInt(I[i]));
                }
            }
            if(!tmp.isEmpty()){
                result.add(iR);
                result.add(tmp.size()/2);
                result.addAll(tmp);
            }
        }

        System.out.print(result.size());

        for(Integer ele:result){
            System.out.print(" "+ele);
        }
        System.out.println();
    }
}
