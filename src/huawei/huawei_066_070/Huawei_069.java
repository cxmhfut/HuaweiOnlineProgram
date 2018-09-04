package huawei.huawei_066_070;

import java.util.Scanner;

/**
 * 矩阵乘法
 */
public class Huawei_069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int m = sc.nextInt();
            int t = sc.nextInt();
            int n = sc.nextInt();

            int A[][] = inputArr(sc,m,t);
            int B[][] = inputArr(sc,t,n);

            matrixMutiply(A,B);
        }

        sc.close();
    }

    public static void printArr(int A[][]){
        int i,j;
        for(i=0;i<A.length;i++){
            for(j=0;j<A[i].length-1;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println(A[i][j]);
        }
    }

    public static int[][] inputArr(Scanner sc,int m,int n){
        int res[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = sc.nextInt();
            }
        }

        return res;
    }

    public static void matrixMutiply(int A[][],int B[][]){
        int m = A.length;   //A m*t
        int n = B[0].length;//B t*n
        int t = A[0].length;
        int C[][] = new int[A.length][B[0].length];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                C[i][j] = 0;
                for(int k=0;k<t;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        printArr(C);
    }
}
