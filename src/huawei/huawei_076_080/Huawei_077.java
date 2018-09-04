package huawei.huawei_076_080;

import java.util.*;

/**
 * 火车进站
 */
public class Huawei_077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i=0;i<n;i++){
                A[i] = sc.nextInt();
            }
            List<int[]> result = new ArrayList<>();
            permutation(A,0,n,result);
            Set<String> ts = new TreeSet<>();
            for(int[] arr:result){
                if(isPopOrder(A,arr)){
                    StringBuilder sb = new StringBuilder();
                    int i;
                    for(i=0;i<arr.length-1;i++){
                        sb.append(arr[i]+" ");
                    }
                    sb.append(arr[arr.length-1]);
                    ts.add(sb.toString());
                }
            }

            for (String sb:ts){
                System.out.println(sb);
            }
        }

        sc.close();
    }

    public static boolean isPopOrder(int in[], int out[]) {
        Stack<Integer> stack = new Stack<>();

        int len = in.length;
        int i, j = 0;

        for (i = 0; i < len; i++) {
            stack.push(in[i]);
            while (j < len && !stack.empty() && out[j] == stack.peek()) {
                stack.pop();
                j++;
            }
        }

        return stack.empty();
    }

    public static void permutation(int A[], int start, int n, List<int[]> result) {
        if(start==n){
            return;
        }
        if(start==n-1){
            int B[] = A.clone();
            result.add(B);
            return;
        }
        for(int i=start;i<n;i++){
            swap(A,start,i);
            permutation(A,start+1,n,result);
            swap(A,start,i);
        }
    }

    public static void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
